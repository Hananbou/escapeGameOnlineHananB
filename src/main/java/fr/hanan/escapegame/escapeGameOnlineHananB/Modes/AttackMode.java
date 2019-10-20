package fr.hanan.escapegame.escapeGameOnlineHananB.Modes;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import fr.hanan.escapeGameOnlineHananB.Config.Configuration;


/**
 * "AttackMode" est la classe représentant le mode Attaque: 
 * Dans ce mode,Player doit deviner le code secret du Computer.
 * Il n'a droit qu' à 5 tentatives.
 * @author hanan
 */

public class AttackMode {
	
	/**
	 *@see Calcul
	 *
	*/
	private static final Logger logger = Logger.getLogger(AttackMode.class);	
	Calcul calcul = new Calcul();
	Configuration config = new Configuration();
	
	public void calculation() {		
		logger.info(" je rentre dans le mode attaque");
		System.out.println("Bienvenue. Vous devez deviner le code secret de l'ordinateur. Il vous indiquera pour chaque chiffre du code si vous devez proposer un chiffre plus grand (+), plus petit (-), ou si celui est bon (=)");

		System.out.println("");
		
		if( config.devOrnot() == true) {			
			System.out.println("Le code secret est: " + calcul.showCodec() );	
		}
		

	int i=0;
	
	for(;i < config.tryNumber();) {
 
	ArrayList<String> str =  calcul.calculAttackMode();
    
	System.out.println("Proposition : "+ str.get(0) +" ->Résultat : " + str.get(1));
     
    if(str.get(0).equals(calcul.showCodec())) {
    	
    	System.out.println("Bravo! Vous avez trouvé le code secret");
    	break;
    	
    }
    i++;
	}
	if(i == config.tryNumber()) {		
		System.out.println("Dommage. Vous avez perdu.");
		
	}	
	logger.info(" fin du calcul pour le mode attaque");	
	}
		
}
