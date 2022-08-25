package com.juan.ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex4.dao.IEquiposDAO;
import com.juan.ex4.dto.Equipos;

@Service
public class EquiposServiceImpl implements IEquiposService{

	@Autowired IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipos> listaEquipos() {
		// TODO Auto-generated method stub
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipos);
	}

	@Override
	public Equipos equiposPorId(int id) {
		// TODO Auto-generated method stub
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos actualizarEquipos(Equipos equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipos);
	}

	@Override
	public void eliminarEquipos(int id) {
		// TODO Auto-generated method stub
		iEquiposDAO.deleteById(null);;
	}

}
