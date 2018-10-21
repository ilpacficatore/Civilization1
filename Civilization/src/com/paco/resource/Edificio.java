package com.paco.resource;

import java.util.ArrayList;

public class Edificio {
	 
	private Lavoro lavoro;
	private double maxLavoratori;
	private ArrayList<Lavoratore> lLavoratori = new ArrayList<Lavoratore>();
	
	public Edificio (Lavoro l, double m) {
		this.lavoro = l;
		this.maxLavoratori = m;
	}

	public Lavoro getLavoro() {
		return lavoro;
	}

	public double getMaxLavoratori() {
		return maxLavoratori;
	}

	public void setMaxLavoratori(double maxLavoratori) {
		this.maxLavoratori = maxLavoratori;
	}

	public ArrayList<Lavoratore> getlLavoratori() {
		return lLavoratori;
	}

	public void setlLavoratori(ArrayList<Lavoratore> lLavoratori) {
		this.lLavoratori = lLavoratori;
	}
	
	public boolean aggLavoratore(Lavoratore l) {
		try {
			lLavoratori.add(l);
			return true;
		}catch(Exception e) {
			System.out.println("lavoratore non aggiunto correttamente contattare un admin");
			return false;
		}
	}
	
	public boolean rimuoviLavoratore(Lavoratore l) {
		try {
			lLavoratori.remove(lLavoratori.indexOf(l));
			return true;
		}catch(Exception e) {
			System.out.println("lavoratore non rimosso correttamente contattare un admin");
			return false;
		}
	}
	
	public boolean spostaLavoratore(Lavoratore l, Edificio e) {
		try {
				e.aggLavoratore(l);
				e.rimuoviLavoratore(l);
				return true;
			
		}catch(Exception ex) {
			System.out.println("lavoratore non spostato correttamente contattare un admin");
			return false;
		}
	}
	
}
