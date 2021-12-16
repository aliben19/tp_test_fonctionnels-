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
      
 Scenario Outline: Enregistrer une rencontre avec un score negatif 
    Given Une rencontre avec un score negatif 
    When l employe valide la rencontreS  
    Then Error le systeme n affiche pas Le resultat 

    Examples:  
     |club 1 | score |score | club2 | MessageError
     |  FCB  |  2    |  -1  |   PSG | le score de club2 est négatif
