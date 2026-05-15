package com.spring.service;


import com.spring.vo.IplPlayersVo;

public interface IIplPlayerService {

	public String savePlayer(IplPlayersVo player);
	public IplPlayersVo findPlayerById(Integer pid) throws IllegalAccessException;
}
