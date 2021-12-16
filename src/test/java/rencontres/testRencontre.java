package rencontres;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class testRencontre {
	/******************** tester le constructeur ***************/
	@Test
	public final void testRencontreConstructeur() {
		 Club club1=new Club("club1");
		 Club club2=new Club("club2") ;
		 int sc1=1;
		 int sc2=2;
		 int mj1 = club1.get_mj();
		 int mj2 = club2.get_mj();
		 int point2 = club2.get_nbpoints();
		 Rencontre r =new Rencontre(club1,club2,sc1,sc2);// Créer une rencontre
		 assertEquals(1,r.getscoreClub1());
		 assertEquals(2,r.getscoreClub2());
		 assertEquals(club1,r.getClub1());
		 assertEquals(club2,r.getClub2());
		 assertEquals(mj1+1,r.getClub1().get_mj());
		 assertEquals(mj2+1,r.getClub2().get_mj());
		 assertEquals(point2+3,r.getClub2().get_nbpoints());
		 for (int i=0; i<19;i++) {
	        	Joueur joueur = club2.getListJoueur().get(i);
	        	assertEquals(1000,joueur.getNombrePoint());
	        }

		
	}
	/************** tester les getter ***************************/
	// Dans ce Cas c'est la meme chose avec le test de constructeur 
	
	@Test
	public final void testgetters() {
		 Club club1=new Club("club1");
		 Club club2=new Club("club2") ;
		 int sc1=1;
		 int sc2=2;
		 Rencontre r=new Rencontre(club1,club2,sc1,sc2);// Créer une rencontre
		    assertEquals(1,r.getscoreClub1());
			assertEquals(2,r.getscoreClub2());
			assertEquals(club1,r.getClub1());
			assertEquals(club2,r.getClub2());
			assertEquals("victoire club 2",r.getResultat()); // le club 2 est le gagnant car sc2>sc1
		
	}
	@Test
	public final void testValider() {
		Club club1=new Club("club1");
		 Club club2=new Club("club2") ;
		 int sc1=1;
		 int sc2=2;
		 Rencontre r=new Rencontre(club1,club2,sc1,sc2);// Créer une rencontre
		 r.Valider();// la rencontre sera validé tant que les 2 scores sont positif 
		Assert.assertTrue(r.getIsValide());
		 }
	@Test
	public final void testErrorMessage() {
		 Club club1=new Club("club1");
		 Club club2=new Club("club2") ;
		 int sc1=-1; // score négatif pour tester si le message d'erreur sera retourné 
		 int sc2=2;
		 Rencontre r=new Rencontre(club1,club2,sc1,sc2);// Créer une rencontre
		 r.Valider();
		 assertEquals("Score Négatif",r.getErrorMessage());
	}


}
