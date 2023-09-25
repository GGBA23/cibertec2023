package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.interfaceService.IEmpleadoService;
import com.cibertec.modelo.Empleado;

@Controller
public class EmpleadoController {

	@Autowired
	private IEmpleadoService servicio;
	
	//Método Listar
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Empleado> datosListaEmp = servicio.Listado();
		m.addAttribute("listaEmp",datosListaEmp);
		return "index";
	}
	
	//Método Registrar
	@GetMapping("/nuevo")
	public String Registrar(Model m) {
		m.addAttribute("empleado", new Empleado());
		return "form";
	}
	
	//Método Grabar
	@PostMapping("/grabar")
	public String Grabar(Empleado e, Model m) {
		servicio.Registrar(e);
		return "form";
	}
}
