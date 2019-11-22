package co.com.airline.service.flights.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Clientflight {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 
    @Column(name = "identification", nullable = false)
    private String identification;
    
    @Column(name = "origin", nullable = false)
    private String origin;
 
    @Column(name = "destination", nullable = false)
    private String destination;
 
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Temporal(TemporalType.TIME)
    private Date time;
    
    @Column(name = "price", nullable = false)
    private int price;
    
    public Clientflight() {
 	}
    
    public Clientflight(String identification, String origin, String destination, Date date,Date time,int price) {
 		super();
 		this.identification = identification;
 		this.origin = origin;
 		this.destination = destination;
 		this.date = date;
 		this.time= time;
 		this.price=price;
 	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
