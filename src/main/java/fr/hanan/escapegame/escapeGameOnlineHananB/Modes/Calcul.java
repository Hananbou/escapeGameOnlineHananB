package fr.hanan.escapegame.escapeGameOnlineHananB.Modes;

import java.util.ArrayList;
import java.util.Random;

import org.apache.log4j.Logger;

import fr.hanan.escapeGameOnlineHananB.Config.Configuration;
import fr.hanan.escapegame.escapeGameOnlineHananB.Home.Main;
import fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs.Computer;
import fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs.Player;

public class Calcul {

	private static final Logger logger = Logger.getLogger(Calcul.class);	
	Configuration config = new Configuration();
	
	Computer c = new Computer();
	Player p = new Player();
	ArrayList<Integer> code = c.returnCode();
	ArrayList<Integer> min = c.returnMin();
	ArrayList<Integer> max = c.returnMax();
	
	ArrayList<Integer> codedefense = c.returnCode();

	public ArrayList<String> calculAttackMode() {
		
		System.out.println("Proposez votre code à "+ config.combiSize()+" chiffres: ");
		
	    ArrayList<Integer> chis = p.returnInt();
		
		ArrayList<String> resultat = new ArrayList<String>();
	    
		
	    for(int index = 0; index < code.size();) {
	    	
	    		if(chis.get(index) == code.get(index)) {
	    			resultat.add("=");
	    		}
	    		else if(chis.get(index) < code.get(index)) {
	    			resultat.add("+");
	    		}
	    		else {
	    			resultat.add("-");
	    		}
	    		
	    		index++;
	    			
	    }
	    
	    StringBuilder chisString = new StringBuilder();
	    StringBuilder resultats = new StringBuilder();
	    for (int i1=0; i1 < config.combiSize(); i1++) {
			
			chisString.append(chis.get(i1));
			resultats.append(resultat.get(i1));
		}
	    ArrayList<String> output = new ArrayList<String>();
	    output.add(chisString.toString());
	    output.add(resultats.toString());
	    return output;
	}
	
	


public ArrayList<String> calculDefenseMode() {
	
	Random r = new Random();
	
	ArrayList<String> reponse = p.returnString();
    
    StringBuilder reponses = new StringBuilder();
    
    for(int i1 = 0; i1 < config.combiSize(); i1++) {
    	
    	reponses.append(reponse.get(i1));
    }
    
    
    System.out.println("Réponse: " + reponses);
 	
    String plus = "+";
    String minus = "-";
    String equal = "=";
    
    for (int i1=0; i1 < config.combiSize(); i1++) {
 	
  		/*if (plus.equals(reponse.get(i1))) {
    		
  			if (codedefense.get(i1) != 9) {
  				codedefense.set(i1 ,codedefense.get(i1) + 1);
  			}
    	}
    	
    	if (minus.equals(reponse.get(i1))) {
    		
    		if (codedefense.get(i1) != 0) {
    			codedefense.set(i1 ,codedefense.get(i1) - 1);
    		}
    	}
    	
    	if (equal.equals(reponse.get(i1))){
    		
    		codedefense.set(i1 ,codedefense.get(i1));
    	
    	}
    	*/
    	
    	
    	if(plus.equals(reponse.get(i1))) {
			
			if(max.get(i1) == min.get(i1)) {			
				max.set(i1,9);
				min.set(i1,0);
				
			}
			min.set(i1, codedefense.get(i1)+1);
			if(max.get(i1) < min.get(i1)) {
				
				max.set(i1,9);
				min.set(i1,0);
				
			}
			
			if(codedefense.get(i1) != 9) {
				codedefense.set(i1,r.nextInt(max.get(i1) - min.get(i1) + 1) + min.get(i1));
			
			}
			
			if(codedefense.get(i1) == 10) {
				codedefense.set(i1, 9);
				
			}
	
    	}
    	if(minus.equals(reponse.get(i1))) {
			
			if(max.get(i1) == min.get(i1)) {	
				max.set(i1,9);
				min.set(i1,0);
				
			}
			max.set(i1, codedefense.get(i1)-1);
			if(max.get(i1) < min.get(i1)) {	
				max.set(i1,9);
				min.set(i1,0);
			}	
			
			if(codedefense.get(i1) != 0) {
				codedefense.set(i1,r.nextInt(max.get(i1) - min.get(i1) + 1) + min.get(i1));
			}
			
			if(codedefense.get(i1) == -1) {
				codedefense.set(i1, 0);
				
			}
		
		if(equal.equals(reponse.get(i1))){	    		
	    	codedefense.set(i1 ,codedefense.get(i1)); 	
	    	}
		}
  	 	
    }
    
    StringBuilder egals = new StringBuilder();
    
    for(int i1 = 0; i1 < config.combiSize() ; i1++) {
    	
    	egals.append("=");
    }
	
    StringBuilder codeString1 = new StringBuilder();
    
    for(int i1 = 0; i1 < config.combiSize(); i1++) {
    	
    	codeString1.append(codedefense.get(i1));
    }
    
    ArrayList<String> answer = new ArrayList<String>();
    
    answer.add (egals.toString());
    answer.add (reponses.toString());
    answer.add (codeString1.toString());
	return answer;
	
	}

	public String showCodec() {
	logger.info(" indication du code de l'ordinateur (uniquement si mode développeur activé)");			
	
	StringBuilder chiffreOrdinateurString = new StringBuilder();
	
	for (int i=0; i < config.combiSize(); i++) {			
		chiffreOrdinateurString.append(code.get(i));
		
	}
	
	return chiffreOrdinateurString.toString();
	}
	
	public String showCodecdefense() {
		logger.info(" indication du code de l'ordinateur (uniquement si mode développeur activé)");			
		
		StringBuilder chiffreOrdinateurString = new StringBuilder();
		
		for (int i=0; i < config.combiSize(); i++) {			
			chiffreOrdinateurString.append(codedefense.get(i));
			
		}
		
		return chiffreOrdinateurString.toString();
	}
}




