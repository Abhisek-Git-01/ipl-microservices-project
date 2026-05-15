package com.spring.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.IplPlayers;
import com.spring.repository.IplPlayersRepository;
import com.spring.rest.IFeignClient;
import com.spring.vo.IplPlayersVo;
import com.spring.vo.IplTeamVo;

@Service
public class IplPlayerServiceImpl implements IIplPlayerService {

	@Autowired
	private IplPlayersRepository playerRepo;
	
	@Autowired
	private IFeignClient client;
	
	@Override
	public String savePlayer(IplPlayersVo playerVo) {
		IplPlayers player = new IplPlayers();
		BeanUtils.copyProperties(playerVo, player);
		Integer id = playerRepo.save(player).getPid();
		return "Player '"+player.getPname()+"' saved with id: "+id;
	}

	@Override
	public IplPlayersVo findPlayerById(Integer pid) throws IllegalAccessException {
		IplPlayers player = playerRepo.findById(pid).orElseThrow(()->new IllegalAccessException("Invalid id !!"));
		IplPlayersVo playerVo = new IplPlayersVo();
		BeanUtils.copyProperties(player, playerVo);
		IplTeamVo teamVo = client.fetchTeamDetails(player.getTid());
	    playerVo.setTeamVo(teamVo);
		return playerVo;
	}

}
