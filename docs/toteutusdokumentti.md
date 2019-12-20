# Toteutusdokumentti

## Ohjelman yleisrakenne

Ohjelma on useammassa erillisessä osassa joista tärkeimmät ovat algoritmit Djikstra ja Astar, tietorakenteet MinHeap (ja x ja y) (ja käyttöliittymä Labyrinth). Toteutuksessa on käytetty Java 11 versiota mitä myös edellytetään ohjelman käytössä. GraphBuilder muodostaa sille annetusta tiedostosta painoja sisältävän verkon algoritmeille. Nämä sitten työstävät sen läpi muodostaen polun, jonka pituus ja suorituksen nopeus otetaan talteen.

## Saavutetut aika- ja tilavaativuudet

* Dijkstran osalta aikavaativuutena on O((|V|+|E|)log|V|) ja tilavaativuutena O(|V|).
* A* aikavaativuus on O(\|V\|+\|E\|)log|V|) ja tilavaativuutena O(|V|).

## Työn mahdolliset puutteet ja parannusehdotukset

Tietyt metodit olisi voinut tehdä optimoidummin. Algoritmeja olisi voinut olla enemmänkin, mutta ajanpuutteen vuoksi tämä suunnitelma ei koskaan toteutunut. Luokat olisi varmasti pitänyt järjestellä hieman paremmin, mutta sekin jäi.

### Lähteet
* http://theory.stanford.edu/%7Eamitp/GameProgramming/AStarComparison.html
* https://en.wikipedia.org/wiki/A*_search_algorithm
* https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
* Russell and Norvig: Artificial Intelligence, A Modern Approach