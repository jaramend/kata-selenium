# Kata Selenium

## Pré-requis
 - Docker est lancé sur la machine
 - Eclipse est disponible avec Java 11
 - Une application tourne (en local ou à distance, mais accessible depuis le poste)
 - L'extension Chrome ou Firefox "Selenium IDE" est installée
 
## Récupération du projet
 - Clone du projet GitHub
 - Aller dans le dossier Selenium Grid et effectuer un docker-compose up -d
 - Importer le Projet Maven dans Eclipse
 
## Configuration
 - Dans le projet Maven, saisir les informations suivantes dans le fichier test.properties :
  * Paramètre REMOTE_GRID avec la valeur suivante : http://localhost:4444/wd/hub
  * Paramètre BASE_URL avec l'adresse de l'application (page d'accueil)
  * Décommenter le type de navigateur à utiliser
  
## Création d'un test avec Selenium IDE
 - Ouverture de Selenium IDE
 - Création du jeu de test
 - Nettoyage des différents steps si besoin
 - Modification des targets
 - Ajout d'éventuels wait et asserts
 - Export en tant que code Junit
 
## Intégration du code dans le projet Maven
 - Copie du code présent dans la méthode @Test
 
## Lancement du test
 - Créer le run configuration dans Eclipse pour effectuer un clean test
 - Lancer le run