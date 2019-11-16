PROJET ESCAPE GAME ONLINE - Hanan Boujrad

1- Compilation du projet avec Maven

- Utiliser la ligne de commande en tant qu'administrateur (si Windows) 
- Aller sur le dossier du projet (grâce à la commande "cd").
- Utiliser la commande:"mvn clean package", ce qui permettra de compiler le projet et créer un dossier target (avec les fichiers compilés)
 
2- Exécution du projet 

1ère méthode:
- copier les fichiers du dossier config dans target
- Utiliser la ligne de commande en tant qu'administrateur (si Windows) 
- Aller sur le dossier du projet (grâce à la commande "cd").
- Uitliser la ligne de commande suivante: java -jar nomdufichiercompile.jar || exemple: java -jar test.jar

Dans notre cas, il y a 2 paramètres:
- les paramètes vm se placent avant le "-jar" 
- les paramètres "program" se placent après le nomdufichiercompile.jar
- les fichiers log4j, config se trouvent dans le dossier target (que vous avez copiés précédemment)
Exemple : java -Dlog4j.configuration=file:C:/escapeGameOnlineHananB/target/log4j2.xml -jar test.jar C:/escapeGameOnlineHananB/target/config.properties


2ème méthode: 
-éxecuter le fichier .bat
Le fichier .bat est déjà créé il se trouve dans le dossier target(que vous avez copiés précédemment).