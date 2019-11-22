package co.com.airline.service.flights.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * JsonApiBodyResponseError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T10:26:52.785-05:00[America/Bogota]")
public class ResponseError   {
	
  @JsonProperty("message")
  private String message = null;
  
  public ResponseError(String message) {
	  this.message=message;
  }
	
  public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
