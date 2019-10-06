package fr.hanan.escapeGameOnlineHananB.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	
	final Properties prop = new Properties();
	InputStream input = null;

	
	public boolean devOrnot(){	
		loadProperties();
		String devModeString = prop.getProperty("devMode");
		boolean devMode = Boolean.parseBoolean(devModeString);
		return devMode;	
	}
	
	public int tryNumber() {
		loadProperties();
		String tryNumberString = prop.getProperty("tryNumber");
		int trialsNumber = Integer.parseInt(tryNumberString);
		return trialsNumber;
	}
	
	public int combiSize() {
		loadProperties();
		String codeSizeString = prop.getProperty("combiSize");
		int codeSize = Integer.parseInt(codeSizeString);
		if(codeSize < 4) {
			
			codeSize = 4;
		}
		return codeSize;
	}
	
	
	private void loadProperties() {
		try {
			input = new FileInputStream("C://workspacejava/escapeGameOnlineHananB/ressources/config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
