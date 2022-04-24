CREATE DATABASE verdenalyrics;

-- CREAZIONE TABELLA ALBUM --
CREATE TABLE IF NOT EXISTS Album(
    idAlbum VARCHAR(10) NOT NULL,
    nomeAlbum VARCHAR(100) NULL,
    tipoAlbum VARCHAR(10) NULL,
    annoUscita VARCHAR(4) NULL,
    immagineAlbum VARCHAR(30) NULL,
    noteAlbum VARCHAR(6000) NULL,
    PRIMARY KEY(idAlbum)
);

-- CREAZIONE TABELLA CANZONI --
CREATE TABLE IF NOT EXISTS Canzone(
    idCanzone VARCHAR(10) NOT NULL,
    nomeCanzone VARCHAR(1000) NULL,
    testoCanzone VARCHAR(6000) NULL,
    writtenBy VARCHAR(1000) NULL,
    producedBy VARCHAR(1000) NULL,
    linkVideo VARCHAR(6000) NULL,
    idAlbum VARCHAR(10) NOT NULL,
    PRIMARY KEY(idCanzone)
);

ALTER TABLE Canzone ADD FOREIGN KEY (idAlbum) REFERENCES Album(idAlbum);

/* =============================================================================================================== */

INSERT INTO Album(idAlbum,nomeAlbum,tipoAlbum,annoUscita,immagineAlbum,noteAlbum) VALUES
  ('A01','Froll sound (Verbena)','Demotape','1997','verbena.jpg',' Verdena è il primo demotape dei Verdena (uscito sotto il nome di Verbena), registrato nel 1996.'),
  ('A02','Verdena (Demotape)','Demotape','1997','verdenademotape.jpg','Verdena è il primo demotape dei Verdena, registrato nel 1997.'),
  ('A03','Valvonauta EP','Ep','1999','valvonautaep.jpg',"Valvonauta è il primo EP dei Verdena, uscito nel 1999. Si tratta del singolo del brano Valvonauta, seconda traccia del loro omonimo album d'esordio."),
  ('A04','Verdena','Album','1999','verdena.jpg',"“Verdena” è il primo album dei Verdena, pubblicato il 24 settembre 1999 per Black Out/Universal.<br />L'album è stato anticipato dal singolo “Valvonauta”, che si è rivelato un successo di pubblico.<br />Il disco è stato prodotto da Giorgio Canali e dagli stessi Verdena.<br />Il soggetto della copertina dell'album è un giocattolo di una serie presente nei Kinder Sorpresa."),
  ('A05','Viba EP','Ep','2000','vibaep.jpg',"Viba è il secondo EP dei Verdena uscito nel 2000. È il secondo del gruppo e deve il suo nome alla ottava canzone dell'album Verdena."),
  ('A06','Solo un grande sasso','Album','2001','soloungrandesasso.jpg',"Solo un grande sasso è il secondo album dei Verdena, pubblicato il 20 settembre 2001 per Black Out/Universal/Mercury Records.<br />Il disco è stato prodotto da Manuel Agnelli e dagli stessi Verdena, e registrato alle Officine Meccaniche.<br />L'album vede la collaborazione di 3 membri della formazione di quel periodo degli Afterhours, difatti, oltre a Manuel Agnelli, compaiono anche Dario Ciffo al violino e Xabier Iriondo al delay ed altri effetti sonori."),
  ('A07','Spaceman EP','Ep','2001','spacemanep.jpg',"Spaceman è il terzo EP dei Verdena uscito nel 2001. Prende nome dalla seconda traccia dell'album Solo un grande sasso. Sipario è interamente strumentale."),
  ('A08','Miami Safari EP','Ep','2002','miamisafariep.jpg',"Miami Safari è il quarto EP dei Verdena, pubblicato nel 2002 dalla collaborazione tra Black Out, Mercury e Universal. Prende nome dalla settima traccia dell'album Solo un grande sasso."),
  ('A09','Afterhours versus Verdeana','Compilation','2002','afterhoursversusverdena.jpg',"Afterhours versus Verdena contiene 6 brani degli Afterhours e 3 dei Verdena. La compilation era un allegato alla rivista Tutto Musica solo per il mese di marzo del 2002."),
  ('A10','Elefante EP','Ep','2004','elefanteep.jpg',"Elefante è il sesto EP dei Verdena uscito nel 2004. Prende titolo dalla sesta traccia estratta dall'album Il Suicidio dei Samurai."),
  ('A11','Il suicidio dei samurai','Album','2004','ilsuicidiodeisamurai.jpg',"Il suicidio dei Samurai è il terzo album dei Verdena, pubblicato il 5 febbraio 2004 per Black Out/Universal.<br />Il disco è il primo interamente prodotto da dagli stessi Verdena, nonché il primo registrato nel loro studio personale, l'Henhouse studio.<br />L'unico collaboratore esterno è Fidel Fogaroli alle tastiere."),
  ('A12','Luna EP','Ep','2004','lunaep.jpg',"Luna è il quinto EP dei Verdena uscito nel 2004. Prende titolo dalla seconda canzone dell'album Il Suicidio dei Samurai.<br />Per promuovere l'EP e l'album Il Suicidio dei Samurai è stato girato il video musicale dell'omonimo brano diretto da Cosimo Alemà della casa di produzione Milonga.<br />I membri del gruppo, incluso Fidel Figaroli, si esibiscono in una stanza completamente rossa decorata da una grande mezza luna dorata posta sullo sfondo. A queste inquadrature si aggiungono della carrellate di primi piani di oggetti concettualmente slegati tra loro riferiti alla sessualità, alla religione oppure legati alla quotidianità, e talvolta dal contenuto scabroso.<br />Il giornalista musicale Claudio Todesco ha descritto il video come una versione visiva dei testi di Alberto Ferrari, per sua ammissione privi di significato, legati alla musicalità e all'estetica, piuttosto che al contenuto."),
  ('A13','Requiem','Album','2007','requiem.jpg',"Requiem è il quarto album dei Verdena, pubblicato il 16 marzo 2007 sotto etichetta Universal. È stato pubblicato non solo in Italia, ma anche all'estero: in Svizzera nello stesso giorno, in Germania e Austria il 13 aprile e in Francia il 16 aprile.<br />Viene pubblicato a distanza di tre anni dal precedente lavoro in studio del gruppo Il suicidio dei samurai e vede alla produzione i Verdena stessi. Solo due tracce vengono co-prodotte da Mauro Pagani (ex-Premiata Forneria Marconi): Angie e Trovami un modo semplice per uscirne.Queste due tracce, inoltre, sono state registrate presso lo studio Officine Meccaniche, mentre il resto dell'album è registrato nell'ex-pollaio adibito a sala prove e studio di registrazione HenHouse, spazio privato in cui sono stati registrati anche Il suicidio dei samurai e demo adolescenziali come Baby I Love You composta nel 1993.<br />Le registrazioni di Requiem sono iniziate nell'aprile del 2005 nell'Henhouse, pollaio adibito a studio di registrazione. Tra i primi pezzi scritti erano presenti, alcuni con titoli provvisori, Il gulliver, Chilometrica, Don Calisto, In Parte a me, Pazienza.<br />Angie, Trovami un modo semplice per uscirne e Non è sono tre dei dieci pezzi acustici abbozzati dal gruppo e sviluppati insieme a Mauro Pagani, che ha arrangiato i 3 pezzi alle Officine Meccaniche e ha dato piccoli consigli fonetici per la scrittura dei testi.<br />Le composizioni dell'album nascono principalmente da lunghe jam session e sperimentazioni in studio, aspetti che secondo Alberto Ferrari sono stati tralasciati durante la genesi dei precedenti album di inediti generando complessivamente atmosfere musicali più pop. Precedentemente i brani più sperimentali venivano messi da parte per andare a comporre le tracklist degli EP o le tracce aggiuntive delle edizioni in vinile. Così come l'approccio alle musiche, è stato cambiato anche l'approccio ai testi («Sono un pochino migliorati rispetto ai primi tempi. Ci ho speso più tempo del solito» afferma Alberto Ferrari) e alle linee vocali, rese più indipendenti dalle regole musicali che il cantante si prefissava.<br />Il disco fa la sua comparsa in un clima di grande attesa, specie fra i fans, dopo una lunga fase di preparazione che vede i Verdena attenti, a detta loro, a "selezionare" la gran quantità di idee venute fuori durante le improvvisazioni. Uniche anticipazioni del nuovo lavoro sono state alcune tracce (una su tutte Il Gulliver) eseguite direttamente in concerto con il pubblico. Il tutto aumenta l'attesa dell'album, mentre il precedente viene pubblicato all'estero (Francia, Svizzera, Germania e Austria) e le date in Italia diventano una rarità (nel 2006 l'unica tappa italiana è stata all'Arezzo Wave).<br />Il titolo è stato scelto perché considerato "universale" e per le sue qualità grafiche. La bassista Roberta Sammarelli spiega: «Cercavamo un titolo corto, una parola comprensibile ovunque, né italiana né inglese. Poi andando in giro abbiamo visto questa scritta su un cimitero...ci piace vederlo scritto, Requiem. Non lo colleghiamo al suo significato, insomma.»<br />La copertina è la fotografia, poi riassemblata dal grafico Paolo De Francesco, di un dipinto eseguito dall'artista Paolo Facchinetti durante una fase della sua lavorazione, che raffigura i volti dei tre componenti del gruppo. Il dipinto in una fase avanzata della sua realizzazione appare in copertina della versione in vinile di Requiem. Le illustrazioni sono state realizzate da Alberto Ferrari con il contributo di alcuni amici del gruppo: Fenuk, Marta Milanese, Cecilia Giabini.<br />Alberto Ferrari ha parlato di somiglianze con la copertina dell'album Bad Reputation dei Thin Lizzy.La copertina di Requiem è simile anche a quella del noto LP dei King Crimson Red. Quest'ultimo dato storico ha alimentato la voce secondo cui il titolo Red fosse l'acronimo del latino Requiem Eterna Dona ("dona l'eterno riposo"). Inoltre, "Requiem" è il titolo dell'ultima traccia di "Beat", album del 1982 dei King Crimson stessi."),
  ('A14','Caños EP','Ep','2007','canosep.jpg',"Caños è il settimo EP dei Verdena uscito il 29 giugno 2007. Prende titolo dalla settima traccia estratta dall'album Requiem.<br />Il videoclip di Caños è ispirato ad una strofa del brano («lingue di bue, un pasto per due»). L'intero video è caratterizzato dal contrasto di colori e oggetti. Il video è stato diretto da Marco Gentile.<br />Il videoclip di Caños è ispirato ad una strofa del brano («lingue di bue, un pasto per due»). L'intero video è caratterizzato dal contrasto di colori e oggetti. Il video è stato diretto da Marco Gentile.<br />“Párabellium” (o “Parabellum”) è stata scritta da D.RaD, programmatore degli Almamegretta scomparso nel 2004.I Verdena hanno ripreso in mano il brano aggiungendoci gli strumenti ora presenti.Inizialmente la canzone doveva finire in una compilation tributo per celebrare a D.RaD, ma il gruppo non riuscì a realizzare la loro versione in tempo. "),
  ('A15','Wow','Album','2011','wow.jpg',"“Wow” è il quinto album in studio dei Verdena, pubblicato come doppio CD il 18 gennaio 2011 da Universal Music Group. Il 20 settembre 2011 è uscito in versione deluxe: i due dischi in formato digipak sono affiancati a un DVD del Wow Tour 2011, con immagini amatoriali realizzate dalla band durante il tour, da cui il nome “Amatour”.<br />I 12 pezzi necessari per pubblicare un album erano già pronti nel 2009, ma Alberto Ferrari, non soddisfatto della brevità del prodotto, ne ha scritti molti altri fino ad arrivare a circa 50.Ritenendo questa volta che i brani fossero troppi, i Verdena ne hanno esclusi alcuni fino ad arrivare, dapprima a 25,poi a 27, ovvero 1 ora e 23 minuti complessivi. Come affermato da Ferrari, pubblicare un album di 27 tracce su un unico CD avrebbe reso l'ascolto troppo pesante, perciò l'unico modo per mantenere integra l'unità del lavoro e, allo stesso tempo, intrattenere l'ascoltatore sarebbe stata quella di fare una pausa dopo 40 minuti di musica e dividere le tracce in due dischi. Questa esigenza artistica rese tesi i rapporti tra il gruppo e i discografici dell'etichetta con cui hanno il contratto, la Universal, perché essi ritenevano il doppio album un "suicidio commerciale".Alla fine la Universal ha acconsentito a pubblicare e distribuire il doppio album solo se non avesse avuto l'obbligo di finanziare i videoclip dei singoli per promuoverlo.Razzi arpia inferno e fiamme infatti è stato realizzato con un budget di soli 5000 euro.<br />La maggior parte dei brani sono stati composti al pianoforte anziché alla chitarra, dando spazio a nuove soluzioni musicali.<br />Il titolo del disco è stato proposto da Luca ed è stato utilizzato sia perché palindromo sia perché si adattava alle atmosfere solari del disco, facendo da controparte al precedente Requiem. Wow/Grape Jam è anche il titolo del doppio album dei Moby Grape. Secondo quanto affermato da Alberto, nonostante i membri dei Verdena ascoltassero questa band psichedelica, vennero a conoscenza di Wow/Grape Jam quando già avevano scelto il proprio titolo.<br />A supporto del gruppo durante le esibizioni dal vivo si è aggiunto il polistrumentista Omid Jazi, che si occupato delle partiture delle seconde chitarre, delle tastiere e dei cori. In preparazione del WOW Tour il gruppo e il turnista hanno provato i brani per otto-nove ore giornaliere durante tutto il mese che ha preceduto l'inizio del tour.<br />L'album è presente nella classifica dei 100 dischi italiani più belli di sempre secondo Rolling Stone Italia alla posizione numero 19. "),
  ('A16','Radar (EjABBABBAjE)','Compilation','2011','radar.jpg',"Radar (EjABBABBAjE) è una compilation dei Verdena, rilasciata il 31 maggio 2011 come allegato alla rivista XL di Repubblica. La raccolta include dieci brani, di cui tre brani live (“Rossella roll over”, “Le scarpe volanti” ed “È solo lunedì”, registrati al concerto all'Alcatraz di Milano il 19 febbraio 2011), tre inediti (“Segale cornuta”, “Inutilniente” e “Baby I Love You”), due demo (“Optical” e “A Capello”) e due versioni di “Razzi arpia inferno e fiamme” (una versione alternativa ed un remix realizzato dagli Aucan)."),
  ('A17','Endkadenz Vol.1','Album','2015','endkadenz1.jpg','Endkadenz Vol. 1 è il sesto album in studio dei Verdena, pubblicato il 27 gennaio 2015 dalla Black Out/Universal.<br />Concepito come un unico album, ma per volere della casa discografica diviso in due volumi. La seconda parte, Endkadenz Vol. 2, è stata pubblicata il 28 agosto 2015.'),
  ('A18','Endkadenz Vol.2','Album','2015','endkadenz2.jpg','Endkadenz Vol. 2 è il settimo album in studio dei Verdena, pubblicato il 28 agosto 2015 dalla Black Out/Universal.<br />Concepito come un unico album, ma per volere della casa discografica diviso in due volumi. La prima parte, Endkadenz Vol. 1, è stata pubblicata il 27 gennaio 2015.'),
  ('A19','Verdena (20th Anniversary Remastered Edition)','Album','2019','verdena20.jpg',"Edizione speciale dell'album Verdena, rilasciata in occasione del suo ventesimo anniversario. Il disco, oltre a contenere l'album originale rimasterizzato, include un secondo disco (denominato “5 Relitti, 2 Residui, 2 Avanzi E 1 Demo”) con del materiale raro ed inedito, tra cui la traccia “Ormogenia”, uno dei pezzi più rari del gruppo, un tempo disponibile solo come traccia bonus nell'edizione in vinile del 1999.");

INSERT INTO Canzone(idCanzone,nomeCanzone,testoCanzone,writtenBy,producedBy,linkVideo,idAlbum) VALUES
  ('C01','Took your name','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/RHXUHLjsyJo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C02','Valium','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/w0500W8H_Jk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C03','DMS 10','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/njiElyyQoS4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C04','Froggs Eggs','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/TVCHjjE0x-Y" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C05','Across','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/TVCHjjE0x-Y" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C06','Stinky Louse','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/R6pP9K6Xwd0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C07','High Heart Corporation','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/j_rbzPVsw24" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C08','Wonder','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/xp0ktn1FjVA" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C09','Leasy Creep','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/47xBy8kcmJM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C10','Porno Dolls Rubber','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/47xBy8kcmJM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C11','Velvet','Lyrics for this song have yet to be released','Alberto Ferrari','Luca Ferrari & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/ayLc1-oCkD8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A01'),
  ('C12','Fuxia','Eroina fertile<br />Vincerai tu<br />Suicida isterico<br />Dove sei?<br />Curami<br />Curami<br />Adesso no<br /><br />Io che non so<br />Più dove andrò<br />Pure se vuoi<br />Ma io non lo so<br />Dove sei<br /><br />Voglio e posso perdere<br />Vincerai tu<br />Sangue in seno voli via<br />Lavami lì<br />Curami<br />Curami<br />Ancora un pò<br /><br />Io che non so<br />Più dove andrò<br />Pure se puoi<br />Ma io non lo so<br />Non lo so<br />Non lo so<br /><br />Dove sei (x17)','Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/3mG4XIoHUb4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C13','Fiato Adolescenziale','Eh, scimmie, non mi frega vivere<br />Succhiandomi, io non devo esigere<br />Carne, bamboline stitiche<br />Cullandomi, io non devo esigere<br />Guardami come sei<br />Io non so più perdere<br />Guardami come puoi<br />Io amavo le mie<br />Scimmie, grandi mani su di me<br />Mangimi, crollo e penso solo a me<br />Guardami come sei<br />Io non so più perdere<br />Guardami come puoi<br />Io non so più perdere<br />Eh<br />Dovrei, fuori me<br />Fuori me<br />Fuori me<br />Fuori me<br />Uh, uhuh, la la<br />Eh, ihih, la la<br />Uh, uhuh, lala, mi<br />Scimmie, non mi frega vivere<br />Succhiandomi, io non devo esigere<br />Carne, bamboline stitiche<br />Cullandomi, io non devo ridere<br />Guardami come sei<br />Io non so più perdere<br />Guardami come puoi<br />Io non so più perdere<br />Eh<br />Ehi, fuori me<br />Fuori me<br />Fuori me<br />Fuori me<br />Fuori me<br />Fuori me<br />Fuori me<br />Fuori me<br />Uh, uhuh, la la<br />Eh, ihih, la la<br />Uh, uhuh, lala, mi','Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/MQFdV7qFk-Q" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C14','Nella Schiuma',"Come vuoi starò fuori e dentro me<br />Puoi convincere le mie labbra perdersi<br />Le mie labbra perdersi<br />Rose lesbiche posso credere<br />Rubi ma non sei carne giovane<br />Come vuoi sarò l'ombra dei miei guai<br />Fiori in foglie e poi scopi labbra e fiori blu<br />Scopi labbra e fiori blu<br />Rose lesbiche posso credere<br />Rubi ma non sei carne giovane<br />Verbena (x8)",'Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/dpQ58cQ16zw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C15','Zoe','Io non dormo mai<br />
          Dormo in me<br />
          Scuse solide<br />
          La mia immagine<br />
          Non sono io<br />
          Sento ridere<br /><br />
          Vorrei credere<br />
          Che non ci sei<br />
          Nelle lacrime<br />
          Forse tu ci sei<br />
          Ma non ci sei<br />
          Vorrei spegnermi<br /><br />
          Io non dormo mai<br />
          E so<br />
          Scuse ruvide<br />
          La mia vanità<br />
          Non sono io<br />
          Sento ridere<br /><br />
          Vorrei credere<br />
          Che non ci sei<br />
          Nelle lacrime<br />
          Forse tu ci sei<br />
          Ma non ci sei<br />
          Vorrei spegnermi<br /><br />
          Uuaaaaaaaaaaaaaah Zoe<br />
          Uuaaaaaaaaaaaaaah Zoe<br />
          Uuaaaaaaaaaaaaaah Zoe<br />
          Uuaaaaaaaaaaaaaah Zoe<br /><br />
          Vorrei credere<br />
          Che non ci sei<br />
          Nelle lacrime<br />
          Forse tu ci sei<br />
          Ma non ci sei<br />
          Vorrei spegnermi<br /><br />
          Su di te<br />
          Te<br />
          Te<br />
          Te<br />','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','Giorgio Canali & Verdena','<iframe width="560" height="315" src="https://www.youtube.com/embed/oxTqxBV4trw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C16','Bambina In Nero',"Lei si consuma su di me<br />
          Lei si nasconde ma non so dov'è<br />
          Con le tue ali in coma stai<br />
          Lei non ha tempo Io non so perché<br />
          Perché<br /><br />
          E tu sei sola<br />
          E tu sei sola<br /><br />
          Lei si consuma su di me<br />
          Lei si consuma lenta dentro me<br />
          Con le tue mani in coma stai<br />
          Lei non ha tempo io non so perché<br />
          Perché<br /><br />
          E tu sei sola<br />
          E tu sei sola<br />
          Tu sei sola<br />
          E tu sei sola",'Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','Giorgio Canali & Verdena','<iframe width="560" height="315" src="https://www.youtube.com/embed/MldsAdfQNFk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C17','Mormorio mucoso','Come sai puoi vincere<br />
          Così guardami so fingere<br />
          Come sai non ho fame<br />
          Come vuoi lo so non fa male<br /><br />
          Guardami puoi fendere<br />
          Voli dentro me so fingere<br />
          Come sai non ho fame<br />
          Come vuoi lo so non fa male<br /><br />
          Come sai non ho fame<br />
          Come vuoi lo so non fa male<br />
          Come sai qui sto bene<br />
          Legami se vuoi non fa male','Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/0chWanAJo5o" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C18','Memo Box',"Occhi neri tremano... dove andrò?<br />
          Labbra in culo chiamami... ti troverò!<br />
          Troverò ahh<br /><br />
          Padre infanga l'anima... vado via<br />
          Cerco, soffro e muoio io... madre mia<br /><br />
          Dimmi che x3<br />
          Dimmi che non hai paura<br />
          Come me<br />
          Dimmi che<br />
          Dimmi che non hai paura<br /><br />
          Pauraa ahhh<br /><br />
          Cielo in freddo coprimi... dove sei?<br />
          La bocca è calda baciami<br />
          Morirei<br /><br />
          Dimmi che x3<br />
          Dimmi che non hai paura<br />
          Come me<br />
          Dimmi che<br />
          Dimmi che non hai paura<br /><br />
          WWWAAAAAAAA<br />
          WWWAAAAAAAA<br />
          WWAAAAAAA<br />
          Dimmi che x3<br />
          Dimmi che non hai paura<br />
          Come me<br />
          Dimmi che<br />
          Dimmi che non hai paura<br /><br />
          Pauraa ahhhua",'Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/v1CIzQ994hw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C19','Sara',"Sara, le tue lacrime sono nuvole<br />
          Oh no le tue rughe sai sono lacrime<br />
          Ah-ha, sono fuori ma, ma perchè vai là?<br />
          Oh no tu puoi dirmelo sono inutile<br /><br />
          Tu mi spegni<br />
          E nuda bevi, tu<br />
          Tu mi spremi<br />
          E nuda bevi, tu<br /><br />
          Tu sei, solo tu non sei<br />
          Tu sei l'unica<br />
          Spari tuoni di su di me siano come sai<br /><br />
          Tu mi spegni<br />
          E nuda bevi, tu<br />
          Tu mi spremi<br />
          E nuda bevi, tu<br /><br />
          Tu mi spegni<br />
          E nuda bevi, tu<br />
          Tu mi spremi<br />
          E nuda bevi, tu",'Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/bf0k3GvqLpQ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C20','Bevimi',"Fuori piove e poi il culo è vergine<br />
          Fuori piove ma so chi sei<br />
          Seno fragile, tu il crimine<br />
          Fuori piove ma so chi sei!<br /><br />
          Oh no, oh no, oh no<br />
          Oh no, oh no, oh no<br />
          Bevimi, so chi sei<br />
          Bevimi, so chi sei<br /><br />
          Padri vigili, culle simili<br />
          Fuori piove ma so chi sei<br />
          Muore l'argine, brucia bene in me<br />
          Fuori piove ma so chi sei<br /><br />
          Oh no, oh no, oh no<br />
          Oh no, oh no, oh no<br />
          Bevimi, so chi sei<br />
          Bevimi, so chi sei",'Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/myP53lzZXTA" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C21','Blu Ninive','Io qui vincibile, ma tu sei qui<br />
          Con me in lacrime, inculami<br />
          Ah yeah!<br /><br />
          In me non credo che, più giù oh sì<br />
          Oh no, non crescere, inculami<br /><br />
          No tu non puoi<br />
          Mi lasci e poi vai<br />
          Waah! Yeah!<br /><br />
          Io qui vincibile, ma tu sei qui<br />
          Con me in lacrime, inculami<br /><br />
          No tu non puoi<br />
          Mi lasci e poi vai<br />
          Waah! Yeah!<br />
          Ah yeah!','Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/GfBEpfBT5sY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02'),
  ('C22','Omnia 2241','[Instrumental]','Alberto Ferrari','Luca Ferrari, Roberta Sammarelli & Alberto Ferrari','<iframe width="560" height="315" src="https://www.youtube.com/embed/jD3DlL9Ox98" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>','A02');
