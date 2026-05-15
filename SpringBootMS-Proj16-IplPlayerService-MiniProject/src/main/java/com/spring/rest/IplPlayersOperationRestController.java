package com.spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.IplPlayerServiceImpl;
import com.spring.vo.IplPlayersVo;


@RestController
@RequestMapping("/player-api")
public class IplPlayersOperationRestController {
   
	@Autowired
	private IplPlayerServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<String> savePlayer(@RequestBody IplPlayersVo playerVo){
		String msg = service.savePlayer(playerVo);
		System.out.println(msg);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{pid}")
	public ResponseEntity<IplPlayersVo> getPlayerById(@PathVariable Integer pid) throws IllegalAccessException{
	
		IplPlayersVo playerVo = service.findPlayerById(pid);
		return new ResponseEntity<IplPlayersVo>(playerVo,HttpStatus.OK);
	}
}
