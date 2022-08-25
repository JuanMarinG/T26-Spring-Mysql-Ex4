package com.juan.ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex4.dao.IInvestigadoresDAO;
import com.juan.ex4.dto.Investigadores;
@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService {

	@Autowired IInvestigadoresDAO iInvestigadoresDAO;
	
	@Override
	public List<Investigadores> listaInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public Investigadores investigadoresPorId(int id) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigadores(Investigadores investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		iInvestigadoresDAO.deleteById(id);
		
	}

}
