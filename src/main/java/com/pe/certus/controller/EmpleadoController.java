package com.pe.certus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pe.certus.entity.Empleado;
import com.pe.certus.service.EmpleadoService;



@Controller
@RequestMapping("/")
public class EmpleadoController {
	
	private final Logger log = LoggerFactory.getLogger(Empleado.class);
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("views/empleado")
	public String listar(Model model) {
		
		
		List<Empleado>empleado =empleadoService.listarEmpleado();
		log.info("lista de Empleados {}", empleado);
		model.addAttribute("empleado", empleado);
		
		return"views/empleado/listar";
	}
	

}
