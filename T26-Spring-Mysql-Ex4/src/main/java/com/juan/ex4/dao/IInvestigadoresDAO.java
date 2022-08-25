package com.juan.ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex4.dto.Investigadores;

public interface IInvestigadoresDAO extends JpaRepository <Investigadores, Integer> {

	
}
