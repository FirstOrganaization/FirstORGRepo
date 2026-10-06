package com.nit.entity;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Cricketer {
	@Id
	@SequenceGenerator(name="seq1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	Long id;
	@Column(length = 30)
	@Nonnull
	String playerName; 
	@Column(length = 30)
	@Nonnull
	String country; 
	@Column(length = 30)
	@Nonnull
	String role; 
	@Column(length = 30)
	@Nonnull
	String team;
	@Nonnull
	Double battingAverage;
	@Nonnull
	Integer matchesPlayed; 
	@Nonnull
	Integer centuries; 
	@Nonnull
	Integer age;
	@Nonnull
    Boolean	retired;
}
