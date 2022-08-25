package com.juan.ex4.service;

import java.util.List;

import com.juan.ex4.dto.Investigadores;


public interface IInvestigadoresService {

		//ALL
		public List<Investigadores> listaInvestigadores();
		//CREATE
		public Investigadores guardarInvestigadores (Investigadores investigadores);
		//READ
		public Investigadores investigadoresPorId(int id);
		//UPDATE
		public Investigadores actualizarInvestigadores(Investigadores investigadores);
		//DELETE
		public void eliminarInvestigadores (int id);
}
