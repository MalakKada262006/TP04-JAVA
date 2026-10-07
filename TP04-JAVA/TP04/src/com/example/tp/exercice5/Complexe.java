package com.example.tp.exercice5;

public class Complexe {
	private double reelle;
	private double imaginaire;

	public Complexe(double reelle, double imaginaire) {
		this.reelle = reelle;
		this.imaginaire = imaginaire;
	}

	public double getReelle() {
		return reelle;
	}

	public void setReelle(double reelle) {
		this.reelle = reelle;
	}

	public double getImaginaire() {
		return imaginaire;
	}

	public void setImaginaire(double imaginaire) {
		this.imaginaire = imaginaire;
	}

	public Complexe plus(Complexe autre) {
		return new Complexe(this.reelle + autre.reelle, this.imaginaire + autre.imaginaire);
	}

	public Complexe moins(Complexe autre) {
		return new Complexe(this.reelle - autre.reelle, this.imaginaire - autre.imaginaire);
	}

	@Override
	public String toString() {
		if (imaginaire >= 0) {
			return (int) reelle + " +" + (int) imaginaire + "i";
		} else {
			return (int) reelle + " " + (int) imaginaire + "i";
		}
	}
}
