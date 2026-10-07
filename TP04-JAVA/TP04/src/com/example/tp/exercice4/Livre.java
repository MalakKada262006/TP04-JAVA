package com.example.tp.exercice4;

public class Livre {
	private static int compteur = 0;
	private final int id;
	private String titre;
	private Auteur auteur;

	public Livre(String titre, Auteur auteur) {
		this.id = ++compteur;
		this.titre = titre;
		this.auteur = auteur;
		if (auteur != null) {
			auteur.ajouterLivre(this);
		}
	}

	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	@Override
	public String toString() {
		return "Livre[id=" + id + ", titre=" + titre + ", auteur=" + (auteur != null ? auteur.getNom() : "Inconnu")
				+ "]";
	}
}
