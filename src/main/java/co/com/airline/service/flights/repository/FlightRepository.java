package co.com.airline.service.flights.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.airline.service.flights.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long> {

	List<Flight> findAll();

}
