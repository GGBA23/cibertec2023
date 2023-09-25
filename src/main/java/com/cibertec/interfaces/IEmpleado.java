package com.cibertec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Empleado;

@Repository
public interface IEmpleado extends JpaRepository<Empleado, String> {

}
