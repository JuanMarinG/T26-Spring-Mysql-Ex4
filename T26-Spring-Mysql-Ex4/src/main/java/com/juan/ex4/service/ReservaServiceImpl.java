package com.juan.ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex4.dao.IReservaDAO;
import com.juan.ex4.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired IReservaDAO iReservaDAO;
	@Override
	public List<Reserva> listaReserva() {
		// TODO Auto-generated method stub
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaPorId(int id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		iReservaDAO.deleteById(id);
		
	}

}
