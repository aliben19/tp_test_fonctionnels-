package rencontres;

import java.util.*;

/**
 * Décrivez votre classe sportif ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Joueur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int nombreJeuxJoue;

    private int nombrePoint ;

    /**
     * Constructeur d'objets de classe sportif
     */
    private int prime = 1000;
    public Joueur()
    {
        // initialisation des variables d'instance
        this.nombreJeuxJoue=0;
        this.nombrePoint=0 ;
       }
    
    
    public void setNombreJeuxJoue(int nombreJeuxJoue){
        this.nombreJeuxJoue=nombreJeuxJoue;
    }

    public void setnombrePoint(int nombrePoint){
        this.nombrePoint=nombrePoint;
    }
    
    public int getNombreJeuxJoue(){
        return this.nombreJeuxJoue;
    }

    public int getNombrePoint(){
        return this.nombrePoint;
    }

    public void incrementNombreJeuxJoue(){
        this.nombreJeuxJoue = this.nombreJeuxJoue + 1;
    }
    
    public void incrementNombrePoint(int point){
        this.nombrePoint = this.nombrePoint + point;
    }
    
    public void sportifJoueUnjeux(Rencontre jeux){
        
        this.nombrePoint=this.nombrePoint + prime;
        this.nombreJeuxJoue = this.nombreJeuxJoue + 1;
        //this.nombreJeuxJoue= this.nombreJeuxJoue + 1;
    }
    /*
    public int moyen(){
        
    return this.nombreJeuxJoue/this.nombrePoint;
    }*/
    
}
