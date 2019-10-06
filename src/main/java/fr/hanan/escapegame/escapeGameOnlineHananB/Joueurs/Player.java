package fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.hanan.escapeGameOnlineHananB.Config.Configuration;

/**
 * "Player" est la classe représentant le joueur ("humain")qui sera confronté au Computer.
 * @author hanan
 */

public class Player {
	
	public static Logger logger = LogManager.getLogger();
	
	private Scanner dataplayer = new Scanner(System.in);;
	Configuration config = new Configuration();

	
	public ArrayList<Integer> returnInt() {

		logger.info("Entrée dans la méthode pour transformer la saisie du joueur en nombre");
	    
		String codePlayer = dataplayer.nextLine();
	  
	    ArrayList<Character> charact = new ArrayList<Character>();
	    ArrayList<Integer> number = new ArrayList<Integer>();
 
	    for (int i = 0; i < config.combiSize(); i++) {
	    	
	    	charact.add(codePlayer.trim().charAt(i));
	    	number.add(Character.getNumericValue((char) charact.get(i)));
	    	
	    }
	    
	    return number;

		
	}
	
	public ArrayList<String> returnString() {
		logger.info("Entrée dans la méthode pour changer le nombre du joueur en chaine de caractères");
		
		String codePlayer = dataplayer.nextLine();
	    
	    ArrayList<Character> charact = new ArrayList<Character>();
	    ArrayList<String> str = new ArrayList<String>();
	    
	    for (int i = 0; i < config.combiSize() ; i++) {
	    	
	    	charact.add(codePlayer.trim().charAt(i));
	    	str.add(String.valueOf((char) charact.get(i)));
	    	
	    }

	    return str;
	}
	
}





	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

