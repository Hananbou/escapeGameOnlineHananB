PROJET ESCAPE GAME ONLINE - Hanan Boujrad

1- Compilation du projet avec Maven

- Utiliser la ligne de commande en tant qu'administrateur (si Windows) 
- Aller sur le dossier du projet (gr�ce � la commande "cd").
- Utiliser la commande:"mvn clean package", ce qui permettra de compiler le projet et cr�er un dossier target (avec les fichiers compil�s)
 
2- Ex�cution du projet 

1�re m�thode:
- copier les fichiers du dossier config dans target
- Utiliser la ligne de commande en tant qu'administrateur (si Windows) 
- Aller sur le dossier du projet (gr�ce � la commande "cd").
- Uitliser la ligne de commande suivante: java -jar nomdufichiercompile.jar || exemple: java -jar test.jar

Dans notre cas, il y a 2 param�tres:
- les param�tes vm se placent avant le "-jar" 
- les param�tres "program" se placent apr�s le nomdufichiercompile.jar
- les fichiers log4j, config se trouvent dans le dossier target (que vous avez copi�s pr�c�demment)
Exemple : java -Dlog4j.configuration=file:C:/escapeGameOnlineHananB/target/log4j2.xml -jar test.jar C:/escapeGameOnlineHananB/target/config.properties


2�me m�thode: 
-�xecuter le fichier .bat
Le fichier .bat est d�j� cr�� il se trouve dans le dossier target(que vous avez copi�s pr�c�demment).