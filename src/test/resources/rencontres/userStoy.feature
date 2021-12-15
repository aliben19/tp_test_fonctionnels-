#Author: Ali Benyoucef

@tag
Feature: Enregistrer toutes les rencontres lors d une journée de la ligue 

  

  @tag2
  Scenario Outline: Enregistrer une rencontre  
    Given creer Une rencontre  
    When l employe valide la rencontre 
    Then le resultat est affiche  

    Examples: 
      | club 1   | score  |score | club2 | Rsultat
      | FCB      |    2   |  0   |  PSG  | Vicoire Club 1
      | ATM      |    1   |  3   |  RMA  | Victoire Club 2 
      
 