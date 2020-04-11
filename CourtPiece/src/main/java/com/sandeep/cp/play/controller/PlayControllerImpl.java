package com.sandeep.cp.play.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.cp.play.domain.CPGame;

@RestController
public class PlayControllerImpl implements PlayController{

	public String createGame()
	{
		System.out.println("Game Created");
		return "GameCreated";
	}
	
	public void createNewGame(@RequestBody CPGame cpGame) {
		
		System.out.println("New CP Game Posted: "+ cpGame.getId()+":"+cpGame.getDisplayName());
		
		
		
	}
	
}
