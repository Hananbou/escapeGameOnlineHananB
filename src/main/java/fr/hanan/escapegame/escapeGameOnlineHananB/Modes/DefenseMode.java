package fr.hanan.escapegame.escapeGameOnlineHananB.Modes;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.hanan.escapeGameOnlineHananB.Config.Configuration;
import fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs.Player;

/**
	 * "DefenseMode" est la classe représentant le mode Defense: 
	 * Dans ce mode,Computer doit deviner le code secret du Player.
	 * Il n'a droit qu'à 5 tentatives.
	 * @author hanan
	 */

public class DefenseMode {
	public static Logger logger = LogManager.getLogger();
	
	Calcul calcul = new Calcul();
	Player p = new Player();
	
	Configuration config = new Configuration();
	
	public void calculation() {
		
		logger.info("je rentre dans le mode défense");
		
		System.out.println("Bienvenue. Ici c'est vous qui détenez un code secret que l'ordinateur doit deviner.Vous indiquerez pour chaque chiffre du code s'il doit être plus grand (+), plus petit (-), ou si celui est bon (=)");
		
		System.out.println("ex: +-=+ si code à 4 chiffres)");
		
		System.out.println("Proposer un code:");
		
		p.returnString();
		
		logger.info("Appel de la méthode pour le renvoi du nombre du joueur en chaine de caractères");
	    
		// random code par l'ordi
 
	    System.out.println("Je vous propose: " + calcul.showCodecdefense());
	    
	    // Le Joueur répond par "+", "-" ou "=";
	    
	    int i = 0;
	   
	    for(; i < config.tryNumber() ; ) {
	    	
	    ArrayList<String> str =	calcul.calculDefenseMode();
	    	
	    
	    if(str.get(0).equals(str.get(1))) {
	    	
	    	System.out.println("j'ai gagné");
	    	break;
	    	
	    }

	    System.out.println("Ou peut-être ceci: " + str.get(2));
	    
	    i++;
	    
	    }
	    if(i == config.tryNumber()) {
	    	System.out.println("vous avez gagné");
	    }
	
	}

	
}
