# Toteutusdokumentti

Aiheena on reitinetsintä labyrintissä arkoituksena on etsiä labyrintissä nopein reitti alusta loppuun.
Käytössä olevat algoritmit ovat AStar ja Dijkstra. Kekona käytetään minimikekoa. Ongelma mikä ratkaistaan on reitinhaku labyrintissä. Ratkaistava ongelma on  mielenkiintoinen ja siihen liittyy monia erinäisiä käyttötarkoituksia, kuten myös historiallista näkökulmaa algoritmien osalta. Ohjelma saa syötteenään labyrintin minkä läpi olisi löydettävä alusta loppuun lisäyllätyksineen. Labyrintin ruudut ovat solmut tavittavine tietoineen. Algoritmien aika- ja tilavaativuudet ovat seuraavat:
* Dijkstran osalta aikavaativuutena on nyt huonoimmillaan O(|V|²) ja tässä tavoittena oleva minimikekoa käyttävä ratkaisu O((|V|+|E|)log|V|). Tilavaativuutena on O(|V|).
* A* aikavaativuus on vaihtelee, mutta on huonoimmillaan sama kuin Dijkstrassa eli O((|V|+|E|)log|V|) ja tilavaativuutena O(|V|).

### Lähteet
* http://theory.stanford.edu/%7Eamitp/GameProgramming/AStarComparison.html
* https://en.wikipedia.org/wiki/A*_search_algorithm
* https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
* Russell and Norvig: Artificial Intelligence, A Modern Approach