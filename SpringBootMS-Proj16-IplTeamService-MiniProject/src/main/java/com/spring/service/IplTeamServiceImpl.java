package com.spring.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.IplTeam;
import com.spring.repository.IIplTeamRepository;
import com.spring.vo.IplTeamVo;
@Service
public class IplTeamServiceImpl implements IIplTeamService {

	@Autowired
	private IIplTeamRepository teamRepo;
	
	@Override
	public String saveTeam(IplTeamVo teamVo) {
		IplTeam team = new IplTeam();
		BeanUtils.copyProperties(teamVo, team);
		Integer id = teamRepo.save(team).getTid();
		return "Team "+team.getTname()+" is saved having team Id : "+id;
	}

	@Override
	public IplTeamVo getTeamById(Integer tid) throws IllegalAccessException {
		IplTeam team = teamRepo.findById(tid).orElseThrow(()->new IllegalAccessException("Invalid id !!"));
		IplTeamVo teamVo = new IplTeamVo();
		BeanUtils.copyProperties(team, teamVo);
		return teamVo;
	}

}
