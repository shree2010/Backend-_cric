package com.cricket.api.services;

import java.util.List;
import java.util.Map;

import com.cricket.api.entities.Match;

public interface MatchService {
	//get all match
	List<Match> getAllMatches();
	
	//get live match
	List<Match> getLiveMathes();
	
	//get point table
	List<List<String>> getPointTabel();
	
}
