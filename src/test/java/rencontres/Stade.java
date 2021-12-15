package rencontres;

import rencontres.Club;

public class Stade 
{
    private String name ;
    private Club  owner  ;
    private int nb_supporteurs ;

    
    public Stade(String name)
    {
        this.name=name; 
    }

    
    public void  add_supporteurs()
    {
        if (owner.get_classement()< 3) {
            this.nb_supporteurs+=2000;
        }
       
    }
    public void  stadeVictoire()
    {
        this.owner.victoire();
        this.nb_supporteurs+=2000;
       
    }
    public Club getOwner() {
    	return this.owner;
    }
    public String getName() {
    	return this.name;
    	
    }
    public int get_nbSupporteurs() {
    	return this.nb_supporteurs;
    }
    public void  setOwner(Club c) {
    	this.owner=c;
    }
    public void setName(String n) {
    	 this.name=n;
    	
    }
    public void set_nbSupporteurs(int nb) {
     this.nb_supporteurs=nb;
    }
    
}
