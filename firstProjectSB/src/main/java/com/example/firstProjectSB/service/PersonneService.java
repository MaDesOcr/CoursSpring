package com.example.firstProjectSB.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstProjectSB.model.Personne;
import com.example.firstProjectSB.repository.PersonneRepository;

@Service
public class PersonneService {

	ArrayList<Personne> personneListe = new ArrayList<Personne>();
	
	@Autowired
	PersonneRepository personneRepository;
	
	public boolean addPersonne(Personne personne) {
		personneRepository.save(personne);
		return true;
	}
	
	public ArrayList<Personne> getPersonneListe(){
		return personneListe;
	}
}
