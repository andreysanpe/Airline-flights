package co.com.airline.service.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineApplication{


    public static void main(String[] args) {
        new SpringApplication(AirlineApplication.class).run(args);
    }
}
