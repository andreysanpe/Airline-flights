package co.com.airline.service.flights.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import co.com.airline.service.flights.service.FlightService;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T10:26:52.785-05:00[America/Bogota]")
@Controller
public class FlightApiController implements FlightApi {
	
	 @Autowired
	 private FlightService flightService;

    public ResponseEntity<?> getFlights() {
    	 return new ResponseEntity<>(flightService.findAllFlight(), HttpStatus.OK);
    }

}

