# Testausdokumentti

## Mitä on testattu, miten tämä tehtiin

Testauksessa käytetään JUnit 4-testejä. Niillä testataan tietorakenteita sekä algoritmejä. Kehitysprosessin aikana on käytetty toki myös perinteistä println-tyylistä testausta. JUnit-testeistä muodostuu Travisin, Codecovin ja Jacoconin avulla kattava dokumentaatio kuvaamaan testausta. Käytössä on algoritmien suoritusajan seuranta perustuen aloitusajan ja lopetusajan erotukseen.

## Minkälaisilla syötteillä testaus tehtiin

Testaus suoritettiin erinäköisiä karttoja käyttämällä. Syötteen periaatteena oli kuitenkin että merkki # tarkoitti seinää ja tyhjä käytävää.

## Miten testit voidaan toistaa

Testit voidaan toistaa ajamalla syötteet uudestaan ohjelman käyttöohjeen mukaan.

## Suorituskykytestaus

Alroritmejä ajettiin useammanlaisella kartalla. Sen jälkeen suorituskykyä mitattiin käytetyn ajan mukaan ja myös reitin pituus katsottiin. Esimerkkikartta.
<pre>
######################################################### #####
#   #   #   #                       #     #         #     #   #
# # # ### # # ### ######### ######### ##### # ##### ##### ### #
# # # #   # #   # #       #         #       # #     #   # #   #
# # # # ### ### # # ##### ####### # ######### ##### # # # # ###
# # # #   # #   #   #   # #   #   #   #     #     #   #   #   #
# # # ### # ### # ### ### ### # ##### # ### ##### ######### # #
# #       #   # #   #     #   # #       # #     #     #     # #
# ########### ##### # ### # ##### ####### ### # ##### # ##### #
# #         #       # #   #       #   #       # #     #   #   #
# # ####### ########### ##### ##### ### ####### # ####### # ###
#   #   # # #           #     #   #   # #     # # #     # # # #
####### # # # ######### ##### # ##### # # ### # # # ### # # # #
#     # #   #   #     # #   # #       # # # # # # # #   # #   #
# # # # # ####### ### ### # # ####### # # # # # # # # ### # # #
# # # # # #       #     # # #   #     # #   #   # # #   # # # #
# # # # # # ### ####### # # ### # ##### ### ##### # ### ### # #
# # #   # # # # #     #   # #   #       #   #   # #   #     # #
# ####### # # # # # # ##### # ########### ### # # ### ####### #
# #     #   # #   # #     # #   #     #   #   # #   # #   #   #
# # # ####### # ######### # ### ##### # ### ### ### # # ### ###
# # #       #   #         # #         # #   # #     #   #     #
# # ####### ##### ### ##### ########### # ### ######### # #####
# #       #       #   # #     #   # #   #       #       # #   #
# ##### ############### # ### # # # # ######### # ######### # #
# #     #   #   #       #   #   #   # #       # #           # #
# # ##### # # ### # ### ##### ### ### ### ### # ############# #
# # #   # # # #   #   #   #   #     #   #   # #     #     #   #
# # # # # # # # ### ##### # ####### ### ### # ##### # # # # ###
#     # # # #   #   #   # # #     #   #     # #   #   # #     #
######### # # ### ### # # # # ### ##### ##### # ##### ####### #
#   #     # # #   #   #   #   # #     #   #   #       #     # #
### # ##### ### ### ########### ##### ### ##### ####### ##### #
#   #   #   #   #   #   #         #   #   #     #       #     #
# ##### # ### ### ### # # ##### ### ### # # # ### ##### # #####
#     # #     #   #   # #     #     #   # # # #   # #   #     #
##### # ####### ####### ######### ### ### # # ##### # # ##### #
#   #         # #     #   #     # # #   # # #       # # #     #
# # ######### # # # # ### ### # # # ### # # ##### ### # #######
# #   #       # # # #   #   # #   #   # # #     #     #       #
# ### # ####### # # ### ### # ##### # # # ######### ######### #
#   # # #       # #   #   # #   #   #   # #         #       # #
### # # ##### ##### # # # # ### ########### ############# ### #
#   # # #   #     # # # # #     #   #     #   #         # #   #
# ### # # # ##### # # # # ### ### # # ### ### # ####### # # ###
#   # #   # #   #   # # # # #     # # # #     #       #   #   #
### ##### ### # ##### # # # ####### # # # ####### ####### ### #
#     #   #   # #   # # #   # #   #   # #   #   #       #     #
# ### # ### ### # ### ####### # # ##### ### # # ##### #########
# #   #     # # #           #   # #     #   # #     #       # #
# # # ####### # ##### # ##### ### # ##### ### ##### ####### # #
# # # #       # #   # #     # # #   #   # # # #           # # #
# # ### ##### # # # ####### # # # ### # # # # # ######### # # #
# # #   #     #   # #     #   # #     #   #   #   #     # #   #
# # # ### ########### ### ##### # ############### ### # # # ###
# #   # # #   #       #   #       #             #   # # # #   #
# ##### # # # ##### ####### ####### ########### ### ### # ### #
#     # #   # #           #     #   #     #     # #   # #   # #
##### # ### # # ####### ### ##### ### # ### ##### ### # ### # #
#     #     #   #         #       #   # #   #   # #   #     # #
# # ##################### ######### # ### ### # # # ### ##### #
# #                     #           #         #   #   #       #
########################################################### ###
</pre>

Ensimmäisessä testikartassa Astar voitti selkeästi. Ollen huomattavasti nopeampi reitin pituuden ollessa kuitenkin sama.

|         | Aika   | Pituus  |
|---------|--------|---------|
|Astar    | 9 ms   | 166     |
|Dijkstra | 14 ms  | 166     |

Toisessa tapauksessa Astar voitti nopeudessa, mutta hävisi reitin pituudessa.

|         | Aika   | Pituus  |
|---------|--------|---------|
|Astar    | 14 ms  | 74      |
|Dijkstra | 21 ms  | 72      |

Kolmannen kartan ollessa ensimmäistä vastaavainen on lopputuloskin pitkälti samankaltainen.

|         | Aika   | Pituus  |
|---------|--------|---------|
|Astar    | 7 ms   | 333     |
|Dijkstra | 17 ms  | 333     |

Neljäs labyrintti edustaa hieman erikoisempaa lähestymistapaa. Tässä tapauksessakin Astar voitti nopeudessa, mutta polun pituudessa saapui häviö.

|         | Aika   | Pituus  |
|---------|--------|---------|
|Astar    | 85 ms   | 2158   |
|Dijkstra | 105 ms  | 2131   |

Viidennessä tapauksessa taistelevat algoritmit pääsivät vaihtelevasti keskimääräisesti kohtalaisen tasaisiin tuloksiin Astarin ollessa kuitenkin useiten nopeampi kuitenkin Dijkstran voittaessa pituudessa.

|         | Aika   | Pituus  |
|---------|--------|---------|
|Astar    | 60 ms  | 154     |
|Dijkstra | 88 ms  | 138     |