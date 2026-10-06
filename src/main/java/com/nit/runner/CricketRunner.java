package com.nit.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Cricketer;
import com.nit.service.CricketService;
@Component
public class CricketRunner implements CommandLineRunner {
  @Autowired
  CricketService cricketService;
	@Override
	public void run(String... args) throws Exception {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter your choice"
				+ "\n1.saveData"
				+ "\n2.findBy country"
				+ "\n3.find Avg MoreThen "
				+ "\n4.find batsmen"
				+ "\n5.Enter Prefix"
				+ "\n6.Find Retied Players"
				+ "\n7.Enter noof century morethen List"
				+ "\n8.find Age Between"
				+ "\n9.Find By Team"
				+ "\n10.count players By Team name"
				+ "\n11.Find Top Avg Player");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			List<Cricketer> list=Arrays.asList(
					new Cricketer("Virat Kohli","India","Batsman","RCB",57.8,300,82,37,false),
					new Cricketer("Rohit Sharma","India","Batsman","MI",49.3,280,35,39,false),
					new Cricketer("Jasprit Bumrah","India","Bowler","MI",18.5,180,0,33,false),
					new Cricketer("Joe Root","England","Batsman","Yorkshire",50.6,210,36,35,false),
					new Cricketer("Ben Stokes","England","All-Rounder","Durham",37.2,160,13,34,false),
					new Cricketer("David Warner","Australia","Batsman","Delhi Capitals",45.8,190,25,39,true),
					new Cricketer("Pat Cummins","Australia","Bowler","SRH",20.1,170,0,34,false),
					new Cricketer("Babar Azam","Pakistan","Batsman","Peshawar",54.5,145,31,31,false)
					);
			cricketService.saveAllCrickter(list);
			break;
		}
		case 2:{
			System.out.println("Eneter Country");
			String str= sc.next();
			cricketService.findByCountry(str).forEach(System.out::println);;
			break;
		}
		case 3:{
			System.out.println("Eneter Avg ");
			Double avg= sc.nextDouble();
			cricketService.findPlayersWithAverageGreaterThan(avg).forEach(System.out::println);;
			break;
		}
		case 4:{
			cricketService.findAllBatsmen().forEach(System.out::println);
			break;
		}
		case 5:{
			System.out.println("Eneter Prefix");
			String str= sc.next();
			cricketService.findPlayersStartingWith(str).forEach(System.out::println);;
			break;
		}
		case 6:{
			cricketService.findRetiredPlayers().forEach(System.out::println);;
			break;
		}
		case 7:{
			System.out.println("Eneter Centuries");
			int str= sc.nextInt();
			cricketService.findPlayersWithMoreCenturies(str).forEach(System.out::println);;
			break;
		}
		case 8:{
			System.out.println("Eneter max age");
			int max= sc.nextInt();
			System.out.println("Eneter min age");
			int min= sc.nextInt();
			cricketService.findPlayersByAgeRange(min,max).forEach(System.out::println);
			break;
		}
		case 9:{
			System.out.println("Eneter Team Name");
			String str= sc.next();
			cricketService.findByTeam(str).forEach(System.out::println);
			break;
		}
		case 10:{
			System.out.println("Eneter Team Name");
			String str= sc.nextLine();
			System.out.println(str);
			System.out.println(cricketService.countPlayersByCountry(str));
			break;
		}
		case 11:{
			System.out.println(cricketService.findTopAveragePlayer());
			break;
		}
	  default :{
		  System.out.println("Invalid Option");	  }
		}
		sc.close();
	}

}
