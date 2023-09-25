package com.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfaceService.IEmpleadoService;
import com.cibertec.interfaces.IEmpleado;
import com.cibertec.modelo.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService{

	@Autowired
	private IEmpleado empleados;
	
	@Override
	public List<Empleado> Listado() {
		return (List<Empleado>) empleados.findAll();
	}

	@Override
	public int Registrar(Empleado emp) {
		int respuesta = 0;
		Empleado ObjE = empleados.save(emp);
		if(!ObjE.equals(null)) respuesta = 1;
		return respuesta;
	}

}
