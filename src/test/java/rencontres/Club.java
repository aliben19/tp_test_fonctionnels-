package rencontres;

import java.util.ArrayList;
import java.util.Collections;

public class Club implements IClub
{
   
	private String name ;
    private int nb_points;
    private int mj; // Match Jou?es 
    private int classement ;
    private ArrayList <Stade> stades ;
    private ArrayList <Joueur> listJoueur;
   
    
    /**
     * Constructeur d'objets de classe Club
     */
    public Club(String name )
    {
    	this.name=name ;
    	this.nb_points = 0;
        this.mj = 0;
        this.stades = new ArrayList<Stade>();
        this.listJoueur = new ArrayList<Joueur>();
        for (int i=0; i<19;i++) {
        	Joueur joueur = new Joueur();
        	this.listJoueur.add(joueur);
        }
    }
    public void addStade(Stade s) {
    	this.stades.add(s);// ajouter le stade ? la liste des satdes du club
    	s.setOwner(this);// affecter le stade au club 
    	}
    
    public void victoire()
    {
        this.nb_points += 3;
    }
    public 	String  get_name()
    {
        return this.name;
    }
    public int get_nbpoints()
    {
        return this.nb_points;
    }
    public int get_mj()
    {
        return this.mj;
    }
    public ArrayList<Stade> get_stades()
    {
        return this.stades;
    }
    public int get_classement()
    {
        return this.classement ;
    }
    public void set_name(String name)
    {
        this.name = name;
    }
    
    public void set_nbpoints(int points)
    {
        this.nb_points = points;
    }
    public void set_mj(int matchs)
    {
        this.mj = matchs;
    }
   
    public void set_classement(int x)
    {
        this.classement = x;
    }
    public void set_stades(ArrayList<Stade> list)
    {
        this.stades= list;
    }
    public ArrayList<Joueur> getListJoueur() {
    	return (this.listJoueur);
    			//this.listJeuxJouer;
    }
  
}
