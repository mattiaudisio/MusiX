CREATE DATABASE verdenalyrics;

-- CREAZIONE TABELLA ALBUM --
CREATE TABLE IF NOT EXISTS Album(
    idAlbum VARCHAR(10) NOT NULL,
    nomeAlbum VARCHAR(100) NULL,
    tipoAlbum VARCHAR(10) NULL,
    annoUscita VARCHAR(4) NULL,
    immagineAlbum VARCHAR(30) NULL,
    PRIMARY KEY(idAlbum)
);

-- CREAZIONE TABELLA CANZONI --
CREATE TABLE IF NOT EXISTS Canzone(
    idCanzone VARCHAR(10) NOT NULL,
    nomeCanzone VARCHAR(1000) NULL,
    testoCanzone VARCHAR(10000) NULL,
    writtenBy VARCHAR(1000) NULL,
    producedBy VARCHAR(1000) NULL,
    linkVideo BLOB NULL,
    idAlbum VARCHAR(10) NOT NULL,
    PRIMARY KEY(idCanzone)
);

ALTER TABLE Canzone ADD FOREIGN KEY (idAlbum) REFERENCES Album(idAlbum);

/* =============================================================================================================== */

INSERT INTO Album(idAlbum,nomeAlbum,tipoAlbum,annoUscita,immagineAlbum) VALUES
  ('A01','Froll sound (Verbena)','Demotape','1997','verbena.jpg'),
  ('A02','Verdena (Demotape)','Demotape','1997','verdenademotape.jpg'),
  ('A03','Valvonauta EP','Ep','1999','valvonautaep.jpg'),
  ('A04','Verdena','Album','1999','verdena.jpg'),
  ('A05','Viba EP','Ep','2000','vibaep.jpg'),
  ('A06','Solo un grande sasso','Album','2001','soloungrandesasso.jpg'),
  ('A07','Spaceman EP','Ep','2001','spacemanep.jpg'),
  ('A08','Miami Safari EP','Ep','2002','miamisafariep.jpg'),
  ('A09','Afterhours versus Verdeana','Compilation','2002','afterhoursversusverdena.jpg'),
  ('A10','Elefante EP','Ep','2004','elefanteep.jpg'),
  ('A11','Il suicidio dei samurai','Album','2004','ilsuicidiodeisamurai.jpg'),
  ('A12','Luna EP','Ep','2004','lunaep.jpg'),
  ('A13','Requiem','Album','2007','requiem.jpg'),
  ('A14','Caños EP','Ep','2007','canosep.jpg'),
  ('A15','Wow','Album','2011','wow.jpg'),
  ('A16','Radar (EjABBABBAjE)','Compilation','2011','radar.jpg'),
  ('A17','Endkadenz Vol.1','Album','2015','endkadenz1.jpg'),
  ('A18','Endkadenz Vol.2','Album','2015','endkadenz2.jpg'),
  ('A19','Verdena (20th Anniversary Remastered Edition)','Album','2019','verdena20.jpg');
