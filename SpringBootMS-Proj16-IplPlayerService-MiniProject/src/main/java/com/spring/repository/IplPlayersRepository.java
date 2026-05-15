package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.IplPlayers;

public interface IplPlayersRepository extends JpaRepository<IplPlayers, Integer> {

}
