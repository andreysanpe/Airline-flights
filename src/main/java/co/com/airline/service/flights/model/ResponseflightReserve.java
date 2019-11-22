package co.com.airline.service.flights.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T10:26:52.785-05:00[America/Bogota]")
public class ResponseflightReserve {

	@JsonProperty("info")
	private String info = null;

	public ResponseflightReserve(String info) {
		super();
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
