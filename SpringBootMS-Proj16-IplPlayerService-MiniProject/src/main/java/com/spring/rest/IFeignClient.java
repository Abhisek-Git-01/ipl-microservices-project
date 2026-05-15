package com.spring.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.vo.IplTeamVo;

@FeignClient("IplTeamService")
public interface IFeignClient {

	@GetMapping("/team-api/find/{tid}")
	public IplTeamVo fetchTeamDetails(@PathVariable Integer tid);
}
