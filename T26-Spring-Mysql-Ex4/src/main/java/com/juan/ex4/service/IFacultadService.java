package com.juan.ex4.service;

import java.util.List;

import com.juan.ex4.dto.Facultad;

public interface IFacultadService {

	//ALL
		public List<Facultad> listaFacultad();
		//CREATE
		public Facultad guardarFacultad (Facultad facultad);
		//READ
		public Facultad facultadPorId(int id);
		//UPDATE
		public Facultad actualizarFacultad(Facultad facultad);
		//DELETE
		public void eliminarFacultad (int id);
}
