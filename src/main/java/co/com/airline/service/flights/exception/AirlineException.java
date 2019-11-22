package co.com.airline.service.flights.exception;

public class AirlineException extends Exception{

	private static final long serialVersionUID = 1L;
	
    private final String message;
  
    public AirlineException(String message) {
        this.message = message;
    }
  
    public String getResponseMessage() {
      return this.message;
    }

 

}
