package fr.hanan.escapeGameOnlineHananB.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * "Configuration" est la classe représentant la configuration des propriétés
 * mode développeur, nombre d'essais, la taille du code;
 * @author hanan
*/

public class Configuration {
	
	final static Properties prop = new Properties();
	InputStream input = null;
	 
	/** 
 	* 	@return la valeur Vrai ou faux pour le mode développeur 
 	*/

	public boolean devOrnot(){	
				
		String devModeString = prop.getProperty("devMode");
		boolean devMode = Boolean.parseBoolean(devModeString);
		return devMode;	
	}
	
	/** 
	* 
 	* 	@return le nombre d'essais par un entier
 	*/
	
	public int tryNumber() {
		
		String tryNumberString = prop.getProperty("tryNumber");
		int trialsNumber = Integer.parseInt(tryNumberString);
		return trialsNumber;
	}

	/** 
	* 
 	* 	@return la taille de la combinaison du code par un entier
 	*/
	
	public int combiSize() {
	
		
		String codeSizeString = prop.getProperty("combiSize");
		int codeSize = Integer.parseInt(codeSizeString);
		if(codeSize < 4) {		
			codeSize = 4;
		}
		return codeSize;
	}
		
	
	public static void loadProperties(String chemin) {		
	/** 
		* Gestion de l'exception concernant le chargement de fichier
	 	* 	@exception try/catch "input" (FileInputStream);
	 	*/	
		
		try {
			InputStream input = new FileInputStream(chemin);
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
