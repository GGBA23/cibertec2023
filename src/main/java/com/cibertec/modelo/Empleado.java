package com.cibertec.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	//Atributos
	@Id
	@Column(name="IdEmpleado")
	private String IdEmpleado;
	@Column(name="Apellidos")
	private String Apellidos;
	@Column(name="Nombres")
	private String Nombres;
	@Column(name="Edad")
	private int Edad;
	@Column(name="Sexo")
	private char Sexo;
	@Column(name="Salario")
	private double Salario;
	
	//Contructores
	public Empleado() {
		
	}
	
	public Empleado(String idEmpleado, String nombres, String apellidos, int edad, char sexo, double salario) {
		IdEmpleado = idEmpleado;
		Nombres = nombres;
		Apellidos = apellidos;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}

	//Getters and Setters
	public String getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
	
}
