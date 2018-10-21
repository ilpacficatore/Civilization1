package com.paco.resource;

import java.util.ArrayList;

public class Lavoro {
	
	private String nomeLavoro;
	private ArrayList<Lavoratore> lLavoratori = new ArrayList<Lavoratore>();
	private Risorsa risorsa;
	
	public Lavoro(String n, Risorsa r) {
		this.nomeLavoro = n;
		this.risorsa = r;
	}

	public String getNomeLavoro() {
		return nomeLavoro;
	}

	public void setNomeLavoro(String nomeLavoro) {
		this.nomeLavoro = nomeLavoro;
	}

	public ArrayList<Lavoratore> getlLavoratori() {
		return lLavoratori;
	}

	public void setlLavoratori(ArrayList<Lavoratore> lLavoratori) {
		this.lLavoratori = lLavoratori;
	}

	public Risorsa getRisorsa() {
		return risorsa;
	}

	public void setRisorsa(Risorsa risorsa) {
		this.risorsa = risorsa;
	}
	
	
}
