package com.spring.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.entity.IplTeam;
import com.spring.repository.IIplTeamRepository;
import com.spring.vo.IplTeamVo;

public class IplServiceImpl implements IIplTeamService {

	@Autowired
	private IIplTeamRepository teamRepo;
	
	@Override
	public String saveTeam(IplTeamVo teamVo) {
		IplTeam team = new IplTeam();
		BeanUtils.copyProperties(teamVo, team);
		Integer id = teamRepo.save(team).getTid();
		return "Team "+team.getTname()+" is saved having team Id : "+id;
	}

}
