POC moteur hybride
===

Maven 3 et java 6

Le but du jeu est de prouver qu'en ayant les implems d'une interface dans le classpath on peut charger les classes en tant que bean Spring.


jarexec-interface : interface métier pour les moteurs hybrides
jarexec-impl : implémentations des calculs de rémunération
jarexec : équivalent du moteur de calcul (classe main)


Usage
===
`cd jarexec-interface
mvn install
cd ../jarexec-impl
mvn install
cd ../jarexec
mvn package
java -jar target/jarexec.jar`