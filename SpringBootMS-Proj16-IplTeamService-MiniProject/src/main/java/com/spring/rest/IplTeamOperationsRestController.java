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

import com.spring.service.IIplTeamService;
import com.spring.vo.IplTeamVo;

@RestController
@RequestMapping("/team-api")
public class IplTeamOperationsRestController {

	@Autowired
	private IIplTeamService teamService;
	
	@PostMapping("/save")
	public ResponseEntity<String> addTeam(@RequestBody IplTeamVo teamVo){
		String msg = teamService.saveTeam(teamVo);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{tid}")
	public ResponseEntity<IplTeamVo> getTeamById(@PathVariable Integer tid) throws IllegalAccessException{
		IplTeamVo teamVo = teamService.getTeamById(tid);
		return new ResponseEntity<IplTeamVo>(teamVo,HttpStatus.OK);
		
	}
}
