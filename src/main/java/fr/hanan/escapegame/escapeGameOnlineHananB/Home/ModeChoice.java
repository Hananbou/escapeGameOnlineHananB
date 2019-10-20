package fr.hanan.escapegame.escapeGameOnlineHananB.Home;

import java.util.Scanner;

import org.apache.log4j.Logger;

import fr.hanan.escapegame.escapeGameOnlineHananB.Home.Main;
import fr.hanan.escapegame.escapeGameOnlineHananB.Modes.AttackMode;
import fr.hanan.escapegame.escapeGameOnlineHananB.Modes.DefenseMode;
import fr.hanan.escapegame.escapeGameOnlineHananB.Modes.DualMode;

	/**
		 * "ModeChoice" est la classe représentant le choix du mode de jeu: 
		 * "Attack", "Defense", "Dual" (classes situées dans le package "Modes").
		 * @author hanan
	 */


public class ModeChoice {
	
	private static final Logger logger = Logger.getLogger(ModeChoice.class);	
	
	//private static final String Main = null;
	AttackMode mode1 = new AttackMode();
	DefenseMode mode2 = new DefenseMode();
	DualMode mode3 = new DualMode();
	private Scanner dataNumber;
	

		
	public void readMode(int number) {
		logger.info("Entrée dans la méthode pour le choix du mode");
		
		if(number == 1) {	
			mode1.calculation();
			logger.info("J'ai fais le choix 1");
		}
		
		if(number == 2) {			
			mode2.calculation();
			logger.info("J'ai fais le choix 2");
		}
		if(number == 3) {	
			mode3.calculation();
			logger.info("J'ai fais le choix 3");
		}
		
		System.out.println("taper 1 pour rejouer, 2 pour page d'accueil, 3 pour quitter l'application");
		
		boolean itsInteger = false;
		while(itsInteger == false) {
			
			try {	
			dataNumber = new Scanner (System.in);
			int numbers = dataNumber.nextInt();
			
			boolean test = true;
				
				while (test == true) {
				
					if(numbers != 1 && numbers != 2 && numbers != 3 ) {
					System.out.println("Veuillez taper soit 1,soit 2 soit 3");
					numbers = dataNumber.nextInt();
					test = true;
					}
				
					if(numbers == 1 || numbers == 2 || numbers == 3 ) {
						test=false;
					}
				
					if(numbers == 1) {
						ModeChoice modech = new ModeChoice();
						modech.readMode(number);
						logger.info("rejouer au même mode");
					}
					else if (numbers == 2){
						Main.main(null);
						logger.info("retour à l'accueil");
					}
					else if(numbers == 3) {
						System.exit(0);
						logger.info("quitter l'application");
					}
					if(test == false) {
						break;
					}
				}
				
				itsInteger = true;
				if(itsInteger == true) {
					break;
				}
			}
			
			catch(java.util.InputMismatchException e) {
				
				logger.error("pas un chiffre entier");
				System.out.println("vous n'avez pas tapé un chiffre entier");
				itsInteger = false;
			}
		}
	}		
}


