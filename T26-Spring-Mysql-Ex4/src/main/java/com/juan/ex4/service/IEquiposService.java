package com.juan.ex4.service;

import java.util.List;

import com.juan.ex4.dto.Equipos;

public interface IEquiposService {


	//ALL
	public List<Equipos> listaEquipos();
	//CREATE
	public Equipos guardarEquipos (Equipos equipos);
	//READ
	public Equipos equiposPorId(int id);
	//UPDATE
	public Equipos actualizarEquipos(Equipos equipos);
	//DELETE
	public void eliminarEquipos (int id);
}
