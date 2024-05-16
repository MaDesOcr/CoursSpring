package com.example.firstProjectSB.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstProjectSB.model.Personne;
import com.example.firstProjectSB.service.PersonneService;

@RestController
public class PersonneController {

	@Autowired
	PersonneService personneService;
	
	@PostMapping("/addPersonne")
	public boolean addPersonne(@RequestBody Personne personne) {
		personneService.addPersonne(personne);
		return true;
	}
	
	@GetMapping("/getPersonnes")
	public ArrayList<Personne> getPersonnes(){
		return personneService.getAllPersonnes();
	}
}
