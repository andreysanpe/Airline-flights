package co.com.airline.service.flights.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import co.com.airline.service.flights.model.Clientflight;


public interface ClientFlightRepository extends CrudRepository<Clientflight, Long> {

	@Query("select c from Clientflight c where c.identification=:identification")
	List<Clientflight> findByIdentificationContaining(@Param("identification") String identification);
	
	@Query("select c from Clientflight c where c.date = :date AND c.identification=:identification")	
	List<Clientflight> findByDateContaining(@Param("date") Date date,@Param("identification") String identification);
	
}