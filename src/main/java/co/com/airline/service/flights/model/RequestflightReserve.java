package co.com.airline.service.flights.model;

import java.sql.Date;
import java.sql.Time;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JsonApiBodyRequestflightReserve
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T10:26:52.785-05:00[America/Bogota]")
public class RequestflightReserve   {
	
  @JsonProperty("idClient")
  private String idClient = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("destination")
  private String destination = null;
  
  @JsonProperty("date")
  private Date date = null;
  
  @JsonProperty("time")
  private Time time = null;
  
  @JsonProperty("price")
  private int price ;

public String getIdClient() {
	return idClient;
}

public void setIdClient(String idClient) {
	this.idClient = idClient;
}

public String getOrigin() {
	return origin;
}

public void setOrigin(String origin) {
	this.origin = origin;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Time getTime() {
	return time;
}

public void setTime(Time time) {
	this.time = time;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


}
