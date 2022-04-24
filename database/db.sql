CREATE DATABASE verdenalyrics;

-- CREAZIONE TABELLA ALBUM --
CREATE TABLE IF NOT EXISTS Album(
    idAlbum VARCHAR(10) NOT NULL,
    nomeAlbum VARCHAR(100) NULL,
    tipoAlbum VARCHAR(10) NULL,
    annoUscita VARCHAR(4) NULL,
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

INSERT INTO Album(idAlbum,nomeAlbum,tipoAlbum,annoUscita) VALUES
  ('A01','Froll sound (Verbena)','Demotape','1997'),
  ('A02','Verdena (Demotape)','Demotape','1997'),
  ('A03','Valvonauta EP','Ep','1999'),
  ('A04','Verdena','Album','1999'),
  ('A05','Viba EP','Ep','2000'),
  ('A06','Solo un grande sasso','Album','2001'),
  ('A07','Spaceman EP','Ep','2001'),
  ('A08','Miami Safari EP','Ep','2002'),
  ('A09','Afterhours versus Verdeana','Compilation','2002'),
  ('A10','Elefante EP','Ep','2004'),
  ('A11','Il suicidio dei samurai','Album','2004'),
  ('A12','Luna EP','Ep','2004'),
  ('A13','Requiem','Album','2007'),
  ('A14','Caños EP','Ep','2007'),
  ('A15','Wow','Album','2011'),
  ('A16','Radar (EjABBABBAjE)','Compilation','2011'),
  ('A17','Endkadenz Vol.1','Album','2015'),
  ('A18','Endkadenz Vol.2','Album','2015'),
  ('A19','Verdena (20th Anniversary Remastered Edition)','Album','2019');
