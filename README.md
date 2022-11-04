# Tasca_S4_01_N1
## _Exercici Spring i Maven_

[![N|Solid](https://itacademy.barcelonactiva.cat/pluginfile.php/1/theme_remui/logo/1666775845/logo.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Aquest exercici t'introduirà al framework SPRING. 
Començaràs a fer servir el protocol HTTP, a usar Postman, i a descobrir com gestionar dependències amb Maven i Gradle..


## Objetius
- Protocol HTTP.
- Primer contacte amb Spring.
- Gestors de dependències (Gradle/Maven).
- ✨Postman✨



- A l’arxiu application.properties, configura la variable server.port amb el valor 9000.
- Convertirem aquesta aplicació en una API REST:
- Depenent del package principal, crea un altre subpackage anomenat Controllers, i dins seu, afegeix la classe HelloWorldController.
- Haurà de tenir dos mètodes:
   - String saluda
   - String saluda2
- Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:
  - “Hola, “ + nom + “. Estàs executant un projecte Maven”.
- El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un RequestParam. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.

Haurà de respondre a:

    http://localhost:9000/HelloWorld
    http://localhost:9000/HelloWorld?nom=El_meu_nom

- El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una PathVariable. El paràmetre "nom" serà opcional.

Haurà de respondre a:

    http://localhost:9000/HelloWorld2
    http://localhost:9000/HelloWorld2/el meu nom

