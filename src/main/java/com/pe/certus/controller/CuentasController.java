package com.pe.certus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CuentasController {
	
	@GetMapping("/views/cuentas")
	public String vistacuentas() {
		return"views/cuentas/cuentas";
	}

}
