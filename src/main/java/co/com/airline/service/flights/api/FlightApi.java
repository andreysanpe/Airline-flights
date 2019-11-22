package co.com.airline.service.flights.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T10:26:52.785-05:00[America/Bogota]")
@Api(value = "flight", description = "the flights API")
public interface FlightApi {

	@CrossOrigin(origins="*")
    @RequestMapping(value = "/flight",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> getFlights();

}
