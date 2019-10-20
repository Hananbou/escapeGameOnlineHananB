package fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs;

import java.util.ArrayList;
import java.util.Random;

import org.apache.log4j.Logger;

import fr.hanan.escapeGameOnlineHananB.Config.Configuration;


/**
 * "Computer" est la classe représentant l'ordinateur ("machine") qui sera confronté au Player
 * @author hanan
 */
public class Computer {
	
	Configuration config = new Configuration();
	
	private static final Logger logger = Logger.getLogger(Computer.class);		

	/**
	 * @return un random pour afficher un code
	 */
	public ArrayList<Integer> returnCode() {
		logger.info("entrée dans la méthode qui retourne un random");
		Random r = new Random();		
		ArrayList<Integer> code = new ArrayList<Integer>();		
		for (int i=0; i < config.combiSize(); i++) {
		
	    code.add(r.nextInt(10));
	    
		}
		
		return code;
	}
	
	/**
	 * @return le chiffre maximum c'est-à-dire 9
	 */
	
	public ArrayList<Integer> returnMax(){
		logger.info("entrée dans la méthode qui retourne un tableau du nombre maximum 9");
		
		ArrayList<Integer> codeMax = new ArrayList<Integer>();
		
		for (int i=0; i < config.combiSize(); i++) {
		
	    codeMax.add(9);
	    
		}
		
		return codeMax;
	
	}
	
	/**
	 * @return le chiffre minimum c'est-à-dire 9
	 */
	
	public ArrayList<Integer> returnMin(){
		logger.info("entrée dans la méthode qui retourne un tableau du nombre minimum 0");
		
		ArrayList<Integer> codeMin = new ArrayList<Integer>();
		
		for (int i=0; i < config.combiSize(); i++) {
		
			codeMin.add(0);
	    
		}
		
		return codeMin;
	
	}

	
	
}
