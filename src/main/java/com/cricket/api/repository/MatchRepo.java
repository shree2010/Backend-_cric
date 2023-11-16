package com.cricket.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.api.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
