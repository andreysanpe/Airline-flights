package co.com.airline.service.flights.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import co.com.airline.service.flights.exception.AirlineException;
import co.com.airline.service.flights.model.RequestflightReserve;
import co.com.airline.service.flights.model.ResponseError;
import co.com.airline.service.flights.service.ClientFlightService;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T10:26:52.785-05:00[America/Bogota]")
@Controller
public class ClientFlightApiController implements ClientFlightApi {
	
	 @Autowired
	 private ClientFlightService clientFlightService;

    public ResponseEntity<?> getFlightsById(@ApiParam(value = "User Identification",required=true) @PathVariable("identification") String identification) {
    	 try {
			return new ResponseEntity<>(clientFlightService.findByIdentification(identification), HttpStatus.OK);
		} catch (AirlineException e) {
			return new ResponseEntity<>(new ResponseError(e.getResponseMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
    
    public ResponseEntity<?> saveReserveFlight(@ApiParam(value = "request body get offer" ,required=true )  @Valid @RequestBody RequestflightReserve body) {
        
    	try {
			return new ResponseEntity<>(clientFlightService.saveReserve(body), HttpStatus.OK);
		} catch (AirlineException e) {
			return new ResponseEntity<>(new ResponseError(e.getResponseMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	
    }

}
