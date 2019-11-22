package co.com.airline.service.flights.service;

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
        return repository.findAll();
    }
}

