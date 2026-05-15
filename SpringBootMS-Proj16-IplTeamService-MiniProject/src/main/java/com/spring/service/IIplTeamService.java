package com.spring.service;

import com.spring.vo.IplTeamVo;

public interface IIplTeamService {

	public String saveTeam(IplTeamVo teamVo);
	public IplTeamVo getTeamById(Integer tid) throws IllegalAccessException;
}
