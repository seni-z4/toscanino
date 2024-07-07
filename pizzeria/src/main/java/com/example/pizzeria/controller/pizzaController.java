package com.example.pizzeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pizzeria.repository.pizzaRepository;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/pizzeria")
public class pizzaController {

	@Autowired
	private pizzaRepository pizzaRepo;
	
	@GetMapping("/menu")
	public String Index(Model model) {
		
		model.addAttribute("pizze" , pizzaRepo.findAll());
		
		return "/pizzeria/index";
	}
	
}
