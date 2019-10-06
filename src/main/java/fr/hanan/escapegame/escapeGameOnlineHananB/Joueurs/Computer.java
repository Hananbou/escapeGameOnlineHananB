package fr.hanan.escapegame.escapeGameOnlineHananB.Joueurs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import fr.hanan.escapeGameOnlineHananB.Config.Configuration;

/**
 * "Computer" est la classe représentant l'ordinateur ("machine") qui sera confronté au Player
 * @author hanan
 */
public class Computer {
	private static Scanner sc;
	Configuration config = new Configuration();
	
	public ArrayList<Integer> returnCode() {
		
		Random r = new Random();
		
		ArrayList<Integer> code = new ArrayList<Integer>();
		
		for (int i=0; i < config.combiSize(); i++) {
		
	    code.add(r.nextInt(10));
	    
		}
		
		return code;
	}
	
	public ArrayList<Integer> returnMax(){
		
		ArrayList<Integer> codeMax = new ArrayList<Integer>();
		
		for (int i=0; i < config.combiSize(); i++) {
		
	    codeMax.add(9);
	    
		}
		
		return codeMax;
	
	}
	public ArrayList<Integer> returnMin(){
		
		ArrayList<Integer> codeMin = new ArrayList<Integer>();
		
		for (int i=0; i < config.combiSize(); i++) {
		
			codeMin.add(0);
	    
		}
		
		return codeMin;
	
	}
	public void Proposecode() {
		
		System.out.println("");
		
		String plus = "+";
		String moins = "-";
		Random r = new Random();
		
		ArrayList<Integer> codeComputer = new ArrayList<Integer>(); 
		ArrayList<Integer> min = new ArrayList<Integer>();
		ArrayList<Integer> max = new ArrayList<Integer>();
		
		codeComputer.add(r.nextInt(10));
		min.add(0);
		max.add(9);	
		
		System.out.println(codeComputer.get(0));
		
		while(true) {
			
			sc = new Scanner(System.in);
			String answer = sc.nextLine();
		
			if(plus.equals(answer)) {
				
				if(max.get(0) == min.get(0)) {			
					max.set(0,9);
					min.set(0,0);
					
				}
				min.set(0, codeComputer.get(0)+1);
				if(max.get(0) < min.get(0)) {
					
					max.set(0,9);
					min.set(0,0);
					
				}
				
				if(codeComputer.get(0) != 9) {
				codeComputer.set(0,r.nextInt(max.get(0) - min.get(0) + 1) + min.get(0));
				
				}
				
				if(codeComputer.get(0) == 10) {
					codeComputer.set(0, 9);
					
				}
		
			}
			
			if(moins.equals(answer)) {
				
				if(max.get(0) == min.get(0)) {	
					max.set(0,9);
					min.set(0,0);
					
				}
				max.set(0, codeComputer.get(0)-1);
				if(max.get(0) < min.get(0)) {	
					max.set(0,9);
					min.set(0,0);
				}	
				
				if(codeComputer.get(0) != 0) {
					codeComputer.set(0,r.nextInt(max.get(0) - min.get(0) + 1) + min.get(0));
				}
				
				if(codeComputer.get(0) == -1) {
					codeComputer.set(0, 0);
					
				}

			}	
			System.out.println(codeComputer.get(0));
		}
		
	}
	
	
}
