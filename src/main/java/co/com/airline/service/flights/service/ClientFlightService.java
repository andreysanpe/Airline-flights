package co.com.airline.service.flights.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.airline.service.flights.exception.AirlineException;
import co.com.airline.service.flights.model.Clientflight;
import co.com.airline.service.flights.model.RequestflightReserve;
import co.com.airline.service.flights.model.ResponseflightReserve;
import co.com.airline.service.flights.repository.ClientFlightRepository;

@Component
public class ClientFlightService {

	@Autowired
    private ClientFlightRepository repository;
 
    public List<Clientflight> findByIdentification(String identification) throws AirlineException {
    	
    	List<Clientflight> clientFlights = repository.findByIdentificationContaining(identification);
    	
    	if(clientFlights.stream().count() > 0) {
    		return clientFlights;
    	}else {
    		throw new AirlineException("El cliente no ha realizado reservas");
    	}
        
    }
    
    public ResponseflightReserve saveReserve(RequestflightReserve request) throws AirlineException {
    	
    	if(repository.findByDateContaining(request.getDate(),request.getIdClient()).stream().count() > 0) {
    		
    		throw new AirlineException("No puede realizar mas de una reserva por dia");
    		
    	}else {
    		
    		Clientflight  response = repository.save(new Clientflight(request.getIdClient(), request.getOrigin(), request.getDestination(), 
    				request.getDate(),request.getTime(),request.getPrice()));
        	
        	return new ResponseflightReserve("Reserva realizada exitosamente para la fecha: "+response.getDate()+" "+response.getTime()
        				+", con destino a "+response.getDestination()+" desde "+response.getOrigin()+", por un valor de: "+response.getPrice()
        				+", para el cliente con cedula: "+response.getIdentification());
    	}
    	
    }
}