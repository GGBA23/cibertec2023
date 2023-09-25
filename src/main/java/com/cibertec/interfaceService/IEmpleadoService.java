package com.cibertec.interfaceService;

import java.util.List;

import com.cibertec.modelo.Empleado;

public interface IEmpleadoService {

	public List<Empleado> Listado();
	public int Registrar(Empleado emp);
}
