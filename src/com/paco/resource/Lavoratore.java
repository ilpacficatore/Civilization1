package com.paco.resource;

public class Lavoratore {
	
	private Lavoro assegnamento;
	private double velocita;
	private String nome;
	
	public Lavoratore(double v, String n) {
		this.velocita = v;
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public Lavoro getAssegnamento() {
		return assegnamento;
	}

	public void setAssegnamento(Lavoro assegnamento) {
		this.assegnamento = assegnamento;
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}
	
	
	
}
