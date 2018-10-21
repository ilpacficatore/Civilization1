package com.paco.resource;

import java.util.ArrayList;

public class Esercito {
	
	private ArrayList<Truppa> lTruppe = new ArrayList<Truppa>();
	private double forzaAttacco;
	private double forzaDifesa;
	
	public Esercito() {
		this.forzaAttacco = 0;
		this.forzaDifesa = 0;
	}

	public ArrayList<Truppa> getlTruppe() {
		return lTruppe;
	}

	public void setlTruppe(ArrayList<Truppa> lTruppe) {
		this.lTruppe = lTruppe;
	}

	public double getForzaAttacco() {
		return forzaAttacco;
	}

	public void setForzaAttacco(double forzaAttacco) {
		this.forzaAttacco = forzaAttacco;
	}

	public double getForzaDifesa() {
		return forzaDifesa;
	}

	public void setForzaDifesa(double forxaDifesa) {
		this.forzaDifesa = forxaDifesa;
	}
	public void aggiungiTruppe(Truppa t) {
		lTruppe.add(t);
	}
	public void rimuoviTruppe(Truppa t) {
		lTruppe.remove(t);
	}
}
