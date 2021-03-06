package model;

import java.util.ArrayList;

public class Personne {
	
	private ArrayList<Groupe> listGroupe;
	
	private String nomPersonne;
	
	public Personne(String nomPersonne){
		this.nomPersonne = nomPersonne;
	}

	public ArrayList<Groupe> getListGroup() {
		return listGroupe;
	}
	
	public Groupe creerGroupe(String nomGroupe){
		
		Groupe groupe = new Groupe(nomGroupe);
		this.listGroupe.add(groupe);
		return groupe;
	}

	/*
	 * 
	 * Getters and setters
	 */
	public ArrayList<Groupe> getListGroupe() {
		return listGroupe;
	}

	public void setListGroupe(ArrayList<Groupe> listGroupe) {
		this.listGroupe = listGroupe;
	}
}
