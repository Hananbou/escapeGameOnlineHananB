package fr.hanan.escapegame.escapeGameOnlineHananB.Modes;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.hanan.escapeGameOnlineHananB.Config.Configuration;
import fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs.Player;

/**
	 * "DualMode" est la classe représentant le mode Duel: 
	 * Dans ce mode, Computer doit deviner le code secret du joueur et vice versa.
	 * Le premier qui a trouvé le code de l'autre gagne.
	 * @author hanan
	 */

public class DualMode {
	public static Logger logger = LogManager.getLogger();

	Calcul calcul = new Calcul();
	Player p = new Player();
	Configuration config = new Configuration();
	
	public void calculation() {
	  logger.info("je rentre dans le mode duel");
	  
	  System.out.println("Bienvenue dans le mode duel du jeu. Ici chacun dispose d'un code secret,le premier qui trouve le code de l'autre a gagné. Il sera indiqué pour chaque chiffre du code s'il doit être plus grand (+), plus petit (-), ou si celui est bon (=)");
	  
	  //Code secret de l'ordinateur:
	 
	  if( config.devOrnot() == true) {			
		System.out.println("Le code secret est: " + calcul.showCodec());	
		}
 
	    System.out.println("Proposez votre code secret à "+ config.combiSize()+" chiffres: ");
	    
	    //code joueur
	    
	    p.returnString();
		//Random ordinateur (proposition):
		
		
	    System.out.println("Je vous propose: " + calcul.showCodecdefense());
  
	    boolean play = true;
	    
	    while (play == true) {
	    
	    	//boucle
	    logger.debug("Appel de la méthode de calcul pour le mode défense");	
	    ArrayList<String> str =	calcul.calculDefenseMode();
	    logger.debug("la méthode de calcul pour le mode défense a été appelée");	
	    
	    if(str.get(0).equals(str.get(1))) {
	    	
	    	System.out.println("Bravo pour l'ordinateur, c'est gagné!");
	    	break;
	    	
	    }	
	    	

		System.out.println("Je vous propose peut-être ceci: " + str.get(2));
	    
		System.out.println("A votre tour "); 
	    
		logger.debug("Appel de la méthode de calcul pour le mode attaque");	
		ArrayList<String> str2 = calcul.calculAttackMode();
		 logger.debug("la méthode de calcul pour le mode attaque a été appelée");
	    
		 //Réponse de l'ordinateur:
	    
		System.out.println("Proposition : "+ str2.get(0) +" ->Résultat : " + str2.get(1));
				
		if(str2.get(0).equals(calcul.showCodec())) {
			play = false;
			System.out.println("Bravo, c'est gagné pour le joueur!");
			break;
		}
		
	    }
	    logger.info("Sortie du mode duel");
	}

	
	
}

