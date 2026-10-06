package com.nit.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Cricketer;

public interface CricketerRepositry extends JpaRepository<Cricketer, Integer> {
	@Query("SELECT c FROM Cricketer c WHERE c.country = :country")
	List<Cricketer> findByCountry(String country);
	@Query("SELECT c FROM Cricketer c WHERE c.battingAverage > :avg")
	List<Cricketer> findPlayersWithAverageGreaterThan(Double avg);
	@Query("SELECT c FROM Cricketer c WHERE c.role = 'Batsman'")
	List<Cricketer> findAllBatsmen();
	@Query("SELECT c FROM Cricketer c WHERE c.playerName LIKE CONCAT(:prefix,'%')")
	List<Cricketer> findPlayersStartingWith(String prefix);
	@Query("SELECT c FROM Cricketer c WHERE c.retired = true")
	List<Cricketer> findRetiredPlayers();
	@Query("SELECT c FROM Cricketer c WHERE c.centuries > :count")
	List<Cricketer> findPlayersWithMoreCenturies(Integer count);
	@Query("SELECT c FROM Cricketer c WHERE c.age BETWEEN :minAge AND :maxAge")
	List<Cricketer> findPlayersByAgeRange(Integer minAge, Integer maxAge);
	@Query("SELECT c FROM Cricketer c WHERE c.team = :team")
	List<Cricketer> findByTeam(String team);
	@Query("SELECT COUNT(c) FROM Cricketer c WHERE c.country = :country")
	Long countPlayersByCountry(String country);
	@Query("SELECT c FROM Cricketer c WHERE c.battingAverage = (SELECT MAX(x.battingAverage) FROM Cricketer x)")
			Cricketer findTopAveragePlayer();
}
