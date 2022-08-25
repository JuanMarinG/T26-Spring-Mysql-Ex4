package com.juan.ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex4.dto.Facultad;

public interface IFacultadDAO extends JpaRepository <Facultad, Integer> {

}
