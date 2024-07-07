package com.example.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pizzeria.model.PizzaModel;

public interface pizzaRepository extends JpaRepository<PizzaModel, Integer> {

	
	
}
