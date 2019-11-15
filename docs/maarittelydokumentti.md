# Määrittelydokumentti

Aiheena on etsiä labyrintissä reitti alkupistestä loppupisteeseen mahdollisimman nopeasti.

Tutkinnan alla ovat algoritmeista näillä näkymin ainakin AStar ja Dijkstra. Näiden lisäksi toteutetaan vielä mahdollisuuksien mukaan jokin juurikin labyrinttien ratkaisemiseen erikoistunut algoritmi. Lähtökohtana on että labyrintti generoidaan ohjelmalla ja tämä labyrintti ratkaistaan edellä mainituilla algoritmieillä. Ajan riittäessä algoritmejä voidaan käyttää myös mahdollisuuksien mukaan jonkin muun kuin perinteisen labyrintin ratkaisuun. Tämä huomioon ottaen puhutaan kohteesta jatkossa tässä dokumentissa toistaiseksi vielä kuitenkin labyrinttinä. Kekona käytetään minimikekoa.

Ongelma mikä olisi ratkaistavana on reitinhaku labyrintissä ja tutkia mikä algoritmi suoriutuu työstä nopeiten. Ratkaistava ongelma on ikuisen mielenkiintoinen ja reittialgoritmeihin liittyy monia käytännön käyttötapauksia, kuten myös historiallista näkökulmaa koko tietojenkäsittelytieteen kehityksen kannalta. Tällä hetkellä nämä valinnankohteeksi päätyneet algoritmit edustustavat riittävällä kattavuudella keskeisiä lähtökohtia ongelman ratkaisuja.

Ohjelma saa syötteenään labyrintin mahdollisine lisäyllätyksineen minkä läpi olisi löydettävä alkupisteestä loppupisteeseen mahdollisimman nopeasti. Käytettävä labyrintti tullaan generoimaan alustavasti ohjelmalla (Daedalus).

Aika- ja tilavaativuudet mitä algoritmien osalta alustavasti tavoitellaan:

* Dijkstran osalta aikavaativuutena on nyt huonoimmillaan O(|V|²) ja tässä tavoittena oleva minimikekoa käyttävä ratkaisu O((|V|+|E|)log|V|). Tilavaativuutena on O(|V|).
* A* aikavaativuus on vaihtelee, mutta on huonoimmillaan sama kuin Dijkstrassa eli O((|V|+|E|)log|V|) ja tilavaativuutena O(|V|).
### Lähteet
* http://theory.stanford.edu/%7Eamitp/GameProgramming/AStarComparison.html 
* https://en.wikipedia.org/wiki/A*_search_algorithm
* https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
* Russell and Norvig: Artificial Intelligence, A Modern Approach