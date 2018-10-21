package com.paco.resource;

public class Truppa {
	
	private String nome;
	private double forzaAttacco;
	private double forzaDifesa;
	private int tempoPruduzione;
	
	public Truppa(String nome, double forzaAttacco, double forzaDifesa, int t) {
		this.nome = nome;
		this.forzaAttacco = forzaAttacco;
		this.forzaDifesa = forzaDifesa;
		this.tempoPruduzione = t;
	}
	public String getNome() {
		return nome;
	}

	public int getTempoPruduzione() {
		return tempoPruduzione;
	}
	public void setTempoPruduzione(int tempoPruduzione) {
		this.tempoPruduzione = tempoPruduzione;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

	public void setForzaDifesa(double forzaDifesa) {
		this.forzaDifesa = forzaDifesa;
	}
}
