package com.cricket.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.api.entities.Match;
import com.cricket.api.services.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMathes(){
		return new ResponseEntity<>(this.matchService.getLiveMathes(),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
	}

	@GetMapping("/pointstable")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTabel(),HttpStatus.OK);
	}
}
