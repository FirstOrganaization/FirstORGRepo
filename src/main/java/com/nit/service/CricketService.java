package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Cricketer;
import com.nit.repositry.CricketerRepositry;

@Component
public class CricketService implements CricketInterface {
	@Autowired
    CricketerRepositry cricketerRepositry ;

	@Override
	public void saveAllCrickter(List<Cricketer> list) {
		cricketerRepositry.saveAll(list);
		System.out.println("Saved All cricketer Data..");
	}

	@Override
	public List<Cricketer> findByCountry(String country) {
		return cricketerRepositry.findByCountry(country);
	}

	@Override
	public List<Cricketer> findPlayersWithAverageGreaterThan(Double avg) {
		return cricketerRepositry.findPlayersWithAverageGreaterThan(avg);
	}
	@Override
	public List<Cricketer> findAllBatsmen() {
		return cricketerRepositry.findAllBatsmen();
	}

	@Override
	public List<Cricketer> findPlayersStartingWith(String prefix) {
		return cricketerRepositry.findPlayersStartingWith(prefix);
	}

	@Override
	public List<Cricketer> findRetiredPlayers() {
		return cricketerRepositry.findRetiredPlayers();
	}

	@Override
	public List<Cricketer> findPlayersWithMoreCenturies(Integer count) {
		return cricketerRepositry.findPlayersWithMoreCenturies(count);
	}

	@Override
	public List<Cricketer> findPlayersByAgeRange(Integer minAge, Integer maxAge) {
		return cricketerRepositry.findPlayersByAgeRange(minAge, maxAge);
	}

	@Override
	public List<Cricketer> findByTeam(String team) {
		return cricketerRepositry.findByTeam(team);
	}

	@Override
	public Long countPlayersByCountry(String country) {
		return cricketerRepositry.countPlayersByCountry(country);
	}

	@Override
	public Cricketer findTopAveragePlayer() {
		return cricketerRepositry.findTopAveragePlayer();
	}

	
    
}
