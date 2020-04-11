package com.sandeep.cp.play.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sandeep.cp.play.domain.CPGame;


@RequestMapping(value="/play")
public interface PlayController {

	@RequestMapping(value="/create")
	public String createGame();
	
	@RequestMapping(method=RequestMethod.POST)
	public void createNewGame(@RequestBody CPGame cpGame);
	
}
