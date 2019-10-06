package fr.hanan.escapegame.escapeGameOnlineHananB.Home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Welcome {
	
	public static Logger logger = LogManager.getLogger();
	
	public void welcoming() {
	logger.info("Entrée dans l'accueil");

	System.out.println("Bienvenue dans l'Escape Game Online:");
	System.out.println("Dans ce jeu, il s'agit de deviner ou faire deviner un code secret à X chiffres.");
	
	System.out.println("Il existe 3 modes de jeu:");
	
	System.out.println("-un mode attaque: en 5 tentatives maximum, vous devez deviner le code secret de l'ordinateur. ");
	
	System.out.println("-un mode défense: en 5 tentatives maximum, l'ordinateur doit deviner le code secret que vous composerez en début de jeu.");
	
	System.out.println("-un mode duel: il s'agit d'une compétition entre vous et l'ordinateur pour trouver le code secret de l'autre. "); 

	
	System.out.println("Veuillez choisir un mode:");		
	System.out.println("pour le mode attaque taper 1");
	System.out.println("pour le mode défense taper 2");
	System.out.println("pour le mode duel taper 3");

	}
	
}