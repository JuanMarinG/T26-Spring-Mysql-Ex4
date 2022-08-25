package com.juan.ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex4.dto.Reserva;

public interface IReservaDAO extends JpaRepository <Reserva, Integer>{

}
