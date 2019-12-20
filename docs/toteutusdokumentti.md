# Toteutusdokumentti

## Ohjelman yleisrakenne

Ohjelma on useammassa erillisessä osassa joista tärkeimmät ovat algoritmit Djikstra ja Astar, tietorakenteet MinHeap (ja x ja y) (ja käyttöliittymä). Toteutuksessa on käytetty Java 11 versiota mitä myös edellytetään ohjelman käytössä.

## Saavutetut aika- ja tilavaativuudet

* Dijkstran osalta aikavaativuutena on O((|V|+|E|)log|V|) ja tilavaativuutena O(|V|).
* A* aikavaativuus on O(\|E\|) ja tilavaativuutena O(|V|).

## Suorituskyky- ja O-analyysivertailu

## Työn mahdolliset puutteet ja parannusehdotukset

Tietyt metodit olisi voinut tehdä optimoidummin, mutta niillä ei ole algoritmien toiminnan kanssa sinänsä merkitystä. Algoritmeja olisi voinut olla enemmänkin, mutta ajanpuutteen vuoksi tämä suunnitelma ei koskaan toteutunut.

## Määrittely

Aiheena on reitinetsintä labyrintissä eli algoritmit etsivät nopeimman reitin labyrintissä reitti alusta loppuun, jonka jälkeen suorittamisessa kulunutta aikaa vertaillaan. Käytössä olevat algoritmit ovat AStar ja Dijkstra. Kekona käytetään minimikekoa. Ratkaistava ongelma on  mielenkiintoinen ja siihen liittyy monia erinäisiä käyttötarkoituksia, kuten myös historiallista näkökulmaa algoritmien osalta. Ohjelma saa syötteenään labyrintin minkä läpi olisi löydettävä alusta loppuun lisäyllätyksineen. Labyrintin ruudut ovat solmut tavittavine tietoineen. 

### Lähteet
* http://theory.stanford.edu/%7Eamitp/GameProgramming/AStarComparison.html
* https://en.wikipedia.org/wiki/A*_search_algorithm
* https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
* Russell and Norvig: Artificial Intelligence, A Modern Approach