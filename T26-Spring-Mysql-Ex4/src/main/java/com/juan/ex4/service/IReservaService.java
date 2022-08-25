package com.juan.ex4.service;

import java.util.List;

import com.juan.ex4.dto.Reserva;

public interface IReservaService {

	//ALL
	public List<Reserva> listaReserva();
	//CREATE
	public Reserva guardarReserva (Reserva reserva);
	//READ
	public Reserva reservaPorId(int id);
	//UPDATE
	public Reserva actualizarReserva(Reserva reserva);
	//DELETE
	public void eliminarReserva (int id);
}
