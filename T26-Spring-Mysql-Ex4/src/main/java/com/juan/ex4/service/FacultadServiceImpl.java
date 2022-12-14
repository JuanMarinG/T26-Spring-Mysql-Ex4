package com.juan.ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex4.dao.IFacultadDAO;
import com.juan.ex4.dto.Facultad;
@Service
public class FacultadServiceImpl implements IFacultadService{

	@Autowired IFacultadDAO iFacultadDAO;
	
	@Override
	public List<Facultad> listaFacultad() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadPorId(int id) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		iFacultadDAO.deleteById(id);
		
	}

}
