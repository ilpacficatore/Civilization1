package com.paco.resource;

import java.util.ArrayList;

public class Civilta {
	
	private String nome;
	private ArrayList<Citta> lCitta = new ArrayList<Citta>();
	private double forzaAttaccoCivilta;
	private double forzaDifesaCivilta;
	
	public Civilta(String n, double f, double fd) {
		this.nome = n;
		this.forzaAttaccoCivilta = f;
		this.forzaDifesaCivilta = fd;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Citta> getlCitta() {
		return lCitta;
	}

	public void setlCitta(ArrayList<Citta> lCitta) {
		this.lCitta = lCitta;
	}

	public double getForzaAttaccoCivilta() {
		return forzaAttaccoCivilta;
	}

	public void setForzaAttaccoCivilta(double forzaAttaccoCivilta) {
		this.forzaAttaccoCivilta = forzaAttaccoCivilta;
	}

	public double getForzaDifesaCivilta() {
		return forzaDifesaCivilta;
	}

	public void setForzaDifesaCivilta(double forzaDifesaCivilta) {
		this.forzaDifesaCivilta = forzaDifesaCivilta;
	}
	public void aggiungiCitta() {
		lCitta.add(new Citta());
	}
	public void aggiungiCitta(Citta c) {
		lCitta.add(c);
	}
	public void rimuoviCitta(Citta c) {
		try {
			lCitta.remove(lCitta.indexOf(c));
		}catch(Exception e) {
			System.out.println("Contattare un admin");
		}
	}
	public void perdiCitta(Citta c, Civilta ci) {
		ci.aggiungiCitta(c);
		this.rimuoviCitta(c);
	}
	
}
