package rencontres;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import cucumber.api.java.en.*;

public class StepsRencontre {
	private Rencontre r ; 
	
	@Given("creer Une rencontre")
	public void creer_Une_rencontre() {
		Club c1= new Club("c1");
		Club c2= new Club("c2");
		int sc1=1,sc2=2;
	this.r=new Rencontre(c1,c2,sc1,sc2);
	}
	
	@When("l employe valide la rencontre")
	public void l_employe_valide_la_rencontre() {
		this.r.Valider();
	}
	
	@Then("le resultat est affiche")
	public void le_resultat_est_affiche(){
	Club gagnant;	
	Assert.assertTrue(this.r.getResultat()=="victoire club 1" ||this.r.getResultat()== "victoire club 2" ||this.r.getResultat()=="match null")	;
	gagnant = r.getGagnant();	
	if (gagnant != null)
	{
		for (int i=0; i<19;i++) {
	    	Joueur joueur = gagnant.getListJoueur().get(i);
	    	assertEquals(1000,joueur.getNombrePoint());
	    }
	}
	}
	
	@Given("Une rencontre avec un score negatif")
	public void Une_rencontre_avec_un_score_negatif() {
		Club c1= new Club("c1");
		Club c2= new Club("c2");
		int sc1=-1,sc2=2;
	this.r=new Rencontre(c1,c2,sc1,sc2);
	}
	@When("l employe valide la rencontreS")
	public void l_employe_valide_la_rencontreS() {
		this.r.Valider();
	}
	@Then("Error le systeme n affiche pas Le resultat")
	public void Error_le_système_n_affiche_pas_Le_résultat(){
	Assert.assertTrue(this.r.getErrorMessage()=="Score Négatif");
	}
	
	

}
