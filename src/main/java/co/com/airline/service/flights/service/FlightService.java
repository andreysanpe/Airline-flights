package co.com.airline.service.flights.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.airline.service.flights.model.Flight;
import co.com.airline.service.flights.repository.FlightRepository;

@Component
public class FlightService {

	@Autowired
    private FlightRepository repository;
 
    public List<Flight> findAllFlight() {
    	List<Flight> response = repository.findAll();
    	
    	for (Flight flight : response) {
    		
    		if(validateIfIsWeekend(flight.getDate())) {
    			flight.setPrice(flight.getPrice()+100000);
    		}
    		
    		if(validateHour(flight.getTime())) {
    			flight.setPrice(flight.getPrice()+50000);
    		}
    		
		}
    	
        return response;
    }
    
    private boolean validateIfIsWeekend(Date date) {
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	int day=calendar.get(Calendar.DAY_OF_WEEK);
    	return day==Calendar.SATURDAY || day==Calendar.SUNDAY;
    }
    
    private boolean validateHour(Date time) {
    	String timeString = String.valueOf(time);
    	int hour =Integer.parseInt(timeString.substring(0, 2));
    	
    	return hour < 12;
    }
}

