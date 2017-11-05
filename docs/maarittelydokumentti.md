# Määrittelydokumentti

Aiheena on reitinetsintä labyrintissä

Tarkoituksena on etsiä labyrintissä nopein reitti alusta loppuun.

Algoritmit joita olisi tarkoitus käyttää ja tutkia ovat aluksi ainakin AStar ja Dijkstra. Kekona käytetään minimikekoa.

Ongelma mikä olisi tarkoitus ratkaista on reitinhaku labyrintissä. Ratkaistava ngelma on riittävän mielenkiintoinen ja siihen liittyy monia erinäisiä käyttötarkoituksia, kuten myös historiallista näkökulmaa algoritmien osalta. Valitut algoritmit ovat oleellisia tämän ongelman ratkaisussa.

Ohjelma saa syötteenään labyrintin minkä läpi olisi löydettävä alusta loppuun lisäyllätyksineen. Labyrintin ruudut ovat solmut tavittavine tietoineen.

Aika- ja tilavaativuudet mitä algoritmien osalta alustavasti tavoitellaan:

* Dijkstran osalta aikavaativuutena on nyt huonoimmillaan O(|V|²) ja tässä tavoittena oleva minimikekoa käyttävä ratkaisu O((|V|+|E|)log|V|). Tilavaativuutena on O(|V|).
* A* aikavaativuus on vaihtelee, mutta on huonoimmillaan sama kuin Dijkstrassa eli O((|V|+|E|)log|V|) ja tilavaativuutena O(|V|).
### Lähteet
* http://theory.stanford.edu/%7Eamitp/GameProgramming/AStarComparison.html
* https://en.wikipedia.org/wiki/A*_search_algorithm
* https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
* Russell and Norvig: Artificial Intelligence, A Modern Approach