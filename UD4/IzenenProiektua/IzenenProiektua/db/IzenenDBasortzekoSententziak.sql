.open Documents/Klaseak2020-21/Programazioa/program2020/UD4/IzenenProiektua/db/IzenenDBa.db

DROP TABLE Izenak; 
CREATE TABLE Izenak(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  izena VARCHAR(20));

INSERT INTO Izenak VALUES(null,"Ane");
INSERT INTO Izenak VALUES(null,"Benito");
INSERT INTO Izenak VALUES(null,"Carlos");
INSERT INTO Izenak VALUES(null,"Dora");
INSERT INTO Izenak VALUES(null,"Elene");
INSERT INTO Izenak VALUES(null,"Fiona");