package com.nit.service;

import java.util.List;

import com.nit.entity.Cricketer;

public interface CricketInterface {
     void saveAllCrickter(List<Cricketer> list);
     List<Cricketer> findByCountry(String country);
     List<Cricketer> findPlayersWithAverageGreaterThan(Double avg);
	 List<Cricketer> findAllBatsmen();
	 List<Cricketer> findPlayersStartingWith(String prefix);
	 List<Cricketer> findRetiredPlayers();
	 List<Cricketer> findPlayersWithMoreCenturies(Integer count);
	 List<Cricketer> findPlayersByAgeRange(Integer minAge, Integer maxAge);
	 List<Cricketer> findByTeam(String team);
	 Long countPlayersByCountry(String country);
	 Cricketer findTopAveragePlayer();
}
