package com.paco.resource;

import java.util.ArrayList;

public class Citta {

	private ArrayList<Edificio> lEdifici = new ArrayList<Edificio>();
	private int qtaLavoratori;
	private double oro;
	private Esercito esercito;
	private ArrayList<Risorsa> lRisorse = new ArrayList<Risorsa>();
	
	public Citta() {
		this.qtaLavoratori = 0;
		this.oro = 0;
		esercito = new Esercito();
	}

	public ArrayList<Edificio> getlEdifici() {
		return lEdifici;
	}

	public void setlEdifici(ArrayList<Edificio> lEdifici) {
		this.lEdifici = lEdifici;
	}

	public int getQtaLavoratori() {
		return qtaLavoratori;
	}

	public void setQtaLavoratori(int qtaLavoratori) {
		this.qtaLavoratori = qtaLavoratori;
	}

	public double getOro() {
		return oro;
	}

	public void setOro(double oro) {
		this.oro = oro;
	}

	public Esercito getEsercito() {
		return esercito;
	}

	public void setEsercito(Esercito esercito) {
		this.esercito = esercito;
	}

	public ArrayList<Risorsa> getlRisorse() {
		return lRisorse;
	}

	public void setlRisorse(ArrayList<Risorsa> lRisorse) {
		this.lRisorse = lRisorse;
	}
	public void aggiungiEdificio(Edificio e) {
		this.lEdifici.add(e);
	}
	public void aggiungiTruppeEsercito(Truppa t) {
		esercito.aggiungiTruppe(t);
	}
	public void rimuoviTruppeEsercito(Truppa t) {
		esercito.rimuoviTruppe(t);
	}
	public void spostaTruppeEsercito(Truppa t, Citta c) {
		c.aggiungiTruppeEsercito(t);
		this.esercito.rimuoviTruppe(t);
	}
	
}
