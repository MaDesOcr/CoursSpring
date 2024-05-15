package com.example.firstProjectSB.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.firstProjectSB.model.Personne;

@Service
public class PersonneService {

	ArrayList<Personne> personneListe = new ArrayList<Personne>();
	
	public boolean addPersonne(Personne personne) {
		personneListe.add(personne);
		return true;
	}
	
	public ArrayList<Personne> getPersonneListe(){
		return personneListe;
	}
}
