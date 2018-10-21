package com.paco.resource;

public class Risorsa {
	
	private String nome;
	private double prezzo;
	private double qta;
	
	public Risorsa(String n, double p) {
		this.nome = n;
		this.prezzo = p;
		this.qta = 0;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getQta() {
		return qta;
	}

	public void setQta(double qta) {
		this.qta = qta;
	}
	
	
	
	
	
	
}
