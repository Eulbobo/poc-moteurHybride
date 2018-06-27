# POC moteur hybride

Le but du jeu est de prouver qu'en ayant les implems d'une interface dans le classpath on peut charger les classes en tant que bean Spring.

## Prérequis

Maven 3

Java 6

## Installation

Les deux projets jarexec-interface et jarexec-impl doivent être packagés et installés dans votre repo maven2 local

``` 
cd jarexec-interface
mvn install
cd ../jarexec-impl
mvn install
```

Il faut ensuite packager le projet principal
```
cd ../jarexec
mvn package
```

## Lancement

```
java -jar target/jarexec.jar
```

## Contributing

Please don't