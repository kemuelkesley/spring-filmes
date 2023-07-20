package br.com.kemsoftware.seachMovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmeController {
	
	@GetMapping("/filme")
	public String mostrarFilmes() {
		return "filme/lista";
	}
}
