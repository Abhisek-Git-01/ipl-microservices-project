package com.spring.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.IplPlayers;
import com.spring.repository.IplPlayersRepository;
import com.spring.vo.IplPlayersVo;
@Service
public class IplPlayerServiceImpl implements IIplPlayerService {

	@Autowired
	private IplPlayersRepository repository;
	
	@Override
	public String savePlayer(IplPlayersVo playerVo) {
		IplPlayers player = new IplPlayers();
		BeanUtils.copyProperties(playerVo, player);
		Integer id = repository.save(player).getPid();
		return "Player '"+player.getPname()+"' saved with id: "+id;
	}

}
