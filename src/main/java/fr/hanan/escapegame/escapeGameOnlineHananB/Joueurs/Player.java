package fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;
import fr.hanan.escapeGameOnlineHananB.Config.Configuration;


/**
 * "Player" est la classe représentant le joueur ("humain")qui sera confronté au Computer.
 * @author hanan
 */

public class Player {
	
	private static final Logger logger = Logger.getLogger(Player.class);	
	private Scanner dataplayer = new Scanner(System.in);;
	Configuration config = new Configuration();
/**
 * @return la saisie du joueur en nombre
 */
	
	public ArrayList<Integer> returnInt() {

		logger.info("Entrée dans la méthode pour transformer la saisie du joueur en nombre");
		ArrayList<Character> charact = new ArrayList<Character>();
	    ArrayList<Integer> number = new ArrayList<Integer>();
	    String codePlayer = null;
		boolean IsNotCorrect = true;
		boolean IsNaN = true;
		while(IsNotCorrect == true) {
			
		
	    try {
			
			
			while(IsNaN == true) {
			codePlayer = dataplayer.nextLine();
			
			try {
				Long.parseLong(codePlayer);
				IsNaN = false;
			}catch(NumberFormatException e) {
				System.out.println("Vous n'avez pas tapé un chiffre entier");
				System.out.println("Veuillez réessayer en tapant "+config.combiSize()+" chiffres");
			}
			
			}
		
	    for (int i = 0; i < config.combiSize(); i++) {
	    	
	    	charact.add(codePlayer.trim().charAt(i));
	    	number.add(Character.getNumericValue((char) charact.get(i)));
	    	
	    }
	    
	    
	    
		}catch(java.lang.StringIndexOutOfBoundsException e) {
			
		}
	    if(charact.size() == config.combiSize() && number.size() == config.combiSize()) {
	    	IsNotCorrect = false;
	    }
	    if(charact.size() != config.combiSize() && number.size() != config.combiSize()) {
	    	charact.clear();
	    	number.clear();
	    	System.out.println("Vous n'avez pas tapé "+config.combiSize()+" chiffres entiers");
			System.out.println("Veuillez réessayer en tapant "+config.combiSize()+" chiffres");
			IsNaN = true;
	    }
		}
	    return number;

		
	}
	
/**
 * @return la saisie du joueur en chaine de caractères
 */
	
	public ArrayList<String> returnString() {
		logger.info("Entrée dans la méthode pour changer le nombre du joueur en chaine de caractères");
		String codePlayer = null;
		ArrayList<Character> charact = new ArrayList<Character>();
	    ArrayList<String> str = new ArrayList<String>();
	    
	    
	    boolean IsNotCorrect = true;
		boolean IsNaN = true;
		while(IsNotCorrect == true) {
			
		
	    try {
	    	
	    while(IsNaN == true) {
	    	
		codePlayer = dataplayer.nextLine();
		
		try {
			Integer.parseInt(codePlayer);
			System.out.println("Vous n'avez pas tapé "+config.combiSize()+" résultats");
			System.out.println("Veuillez réessayer en tapant "+config.combiSize()+" résultats");
		}catch(NumberFormatException e) {
			
			IsNaN = false;
		}
		
		
		}
	    
	    
	    for (int i = 0; i < config.combiSize() ; i++) {
	    	
	    	charact.add(codePlayer.trim().charAt(i));
	    	str.add(String.valueOf((char) charact.get(i)));
	    	
	    }
	    }catch(java.lang.StringIndexOutOfBoundsException e) {
			
	
	    
		}
	    try {
	    	
	    
	    for (int i = 0; i < config.combiSize() ; i++) {
	 	    	
	 	    	if("+".equals(str.get(i)) || "-".equals(str.get(i)) || "=".equals(str.get(i))) {
	 	    		
	 	    	}
	 	    	else {
	 	    		charact.clear();
	 	    		str.clear();
	 	    	}
	 	    
	    }
	    }
	    catch(java.lang.IndexOutOfBoundsException e) {
	    	
	    }
	    
	    if(charact.size() == config.combiSize() && str.size() == config.combiSize()) {
	 	    	IsNotCorrect = false;
	 	}
	 	    
	    if(charact.size() != config.combiSize() && str.size() != config.combiSize()) {
	 	    	charact.clear();
	 	    	str.clear();
	 	    	System.out.println("Vous n'avez pas tapé "+config.combiSize()+" résultats");
	 			System.out.println("Veuillez réessayer en tapant "+config.combiSize()+" résultats");
	 			IsNaN = true;
	 	}	
	    
	   
		
		}
	    return str;
	}
	
}





	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

