a
 Pohdi voitaisiinko Visitor-mallia käyttää State-mallin kontekstiolioiden käsittelyyn. 
 
 Kontekstioliot olisivat eri pelihahmoja, jotka ovat eri tiloissa. 
 
 Pelissä haluttaisiin käydä kaikki pelihahmot läpi esim. siten että jokaiselle hahmolle annetaan bonuspisteitä. Annettavien bonuspisteiden määrä voi riippua kuitenkin hahmosta ja sen tilasta. 
 
 Bonus-visitorissa on metodi kunkin hahmon kutakin tilaa kohden. Esitä tällainen bonuspisteiden jakaminen Java-koodina.

Toteutuksesta: Kontekstioliolle sanotaan accept(visitor), joka delegoi pyynnön tilaoliolleen.
