package fr.hanan.escapegame.escapeGameOnlineHananB.Home;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
	 * "Main" est la classe permettant d'exécuter les commandes: 
	 * Il contient une page d'accueil indiquant le choix des modes et les règles du jeu0.
	 * Il est également possible de rejouer ou relancer l'application.
	 * @author hanan
 */

public class Main {

	public static Logger logger = LogManager.getLogger();	
	
	private static Scanner dataNumber;
	
	public static void main(String[] args) {

		logger.info("je rentre dans l'application");
	
		Welcome welcome = new Welcome();
		logger.debug("Appel de la méthode pour aller à l'accueil");
		welcome.welcoming();
		logger.debug("la méthode pour aller à l'accueil a été appelée");
		
		ModeChoice modec = new ModeChoice();
		
		boolean itsInteger = false;	
		while(itsInteger == false) {
			
		try {
	
			dataNumber = new Scanner (System.in);
			int number = dataNumber.nextInt();
			boolean test = true;
			
			while (test == true) {
			
				if(number != 1 && number != 2 && number != 3 ) {
				System.out.println("Veuillez taper soit 1,soit 2 soit 3");
				number = dataNumber.nextInt();
				test = true;
				}
			
				if(number == 1 || number == 2 || number == 3 ) {
					test=false;
				}
				
				if(test == false) {
					break;
				}
			}
			logger.debug("Appel de la méthode qui permet de choisir le mode");
			modec.readMode(number);	
			logger.debug ("La méthode pour choisir le mode a été appelée");
			
			itsInteger = true;
			if(itsInteger == true) {
				break;
			}
			}
		
		catch(java.util.InputMismatchException e) {
			logger.error("pas un chiffre entier");
			System.out.println("vous n'avez tapé un chiffre entier");
			
			itsInteger = false;
			}
	
		}
	
	}

}
