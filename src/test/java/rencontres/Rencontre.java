package rencontres;

import java.util.ArrayList;

import rencontres.Club;

public class Rencontre {
	private Club club1,club2 ;
	private int scoreClub1, scoreClub2 ;
	private boolean isValide=true ;
	private String resultat ;
	private Club clubGagnant;
	private ArrayList <Joueur> listJoueur;
	
	public Rencontre(Club club1, Club club2,int sc1 , int sc2){
		this.club1=club1;
		this.club2=club2;
		this.scoreClub1=sc1;
		this.scoreClub2=sc2;
		this.club1.set_mj(this.club1.get_mj()+1);
		this.club2.set_mj(this.club2.get_mj()+1);
		if(this.scoreClub1>this.scoreClub2 ) {
			this.resultat="victoire club 1";
			this.clubGagnant = club1;
		}
		else{if(this.scoreClub1<this.scoreClub2 ) {
			this.resultat="victoire club 2";
			this.clubGagnant = club2;
			}
		else{if(this.scoreClub1==this.scoreClub2 ) {
			this.resultat="Match null ";
			}}}
		if(clubGagnant != null) {
			listJoueur = clubGagnant.getListJoueur();
			clubGagnant.victoire();
			for (int i = 0; i < listJoueur.size(); i++) {
				Joueur joueur = listJoueur.get(i);
				joueur.sportifJoueUnjeux(this);
			}
		}
	}
	
	public void Valider() {
		if (this.scoreClub1<0 || this.scoreClub2<0) {
			this.isValide=false;
		}
	}
	
	public Club getClub1() { return this.club1 ;}
	public Club getClub2() { return this.club2 ;}
	public Club getGagnant() { return this.clubGagnant ;}
	
	public int getscoreClub1() {return this.scoreClub1;}
	public int getscoreClub2() {return this.scoreClub2;}
    public String getResultat() {return this.resultat;} 
    public boolean getIsValide() {return this.isValide;} 
	
	public String getErrorMessage(){
		return !this.isValide ? "Score Négatif" : "" ; 
	}
	
	public void setscoreClub1(int s1) {this.scoreClub1=s1;}
	public void setscoreClub2(int s2) {this.scoreClub2=s2;}
	public void setResultat(String rslt) {this.resultat=rslt;}
}
