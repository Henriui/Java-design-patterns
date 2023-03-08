11.	Memento: Arvuuttajalla on useita asiakkaita (säikeitä), joita kutakin varten se arpoo luvun, jota asiakas yrittää arvata toistuvasti. Peli käynnistyy siten, että asiakas ilmoittautuu peliin mukaan Arvuuttajan liityPeliin()-metodilla. Metodissa arvuuttaja arpoo luvun ja tallentaa sen. 

(Perinteinen tapa toteuttaa Arvuuttaja, on määritellä siihen HashMap, jossa säilytetään asiakaskohtaiset tiedot (key = asiakas, value=luku). Arvatessaan lukua asiakas välittää arvaus()-kutsussa parametrina itsensä ja arvauksensa. Paluuarvona on true tai false. Unohda tämä!)

Mementoa käytettäessä HashMap-ratkaisua ei tarvita eikä asiakkaan viitteen välittämistä arvuuttajalle. Arvuuttaja palauttaa liityPeliin()-metodissa asiakkaalle Mementon, jossa on arvottu luku, joten  Arvuuttajan ei sitä tarvitse muistaa. Huomaa, että asiakas ei saa päästä lukuun käsiksi! Jokaisen arvauksensa yhteydessä asiakas välittää Arvuuttajalle Mementon, jossa olevaa lukua Arvuuttaja vertaa uuteen arvaukseen ja kertoo, kuinka kävi. Peli päättyy, kun kaikki säikeet ovat arvanneet oikein.
Toteuta ohjelma Javalla.
