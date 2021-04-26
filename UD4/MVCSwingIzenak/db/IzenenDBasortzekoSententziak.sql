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

.open C:/Users/moreno.manuel/Downloads/Programazioa/UD1/Program/Programazioa-DAM1/MVCSwingHerriak/db/HerrienDBa.db

DROP TABLE Herriak;
CREATE TABLE Herriak(
    Herria VARCHAR(50) PRIMARY KEY,
    Probintzia VARCHAR(50),
    Hondartza SMALLINT(1),
    Oharrak VARCHAR(255));

INSERT INTO Herriak VALUES("Bilbo","Bizkaia",0,"Bizkaia hiriburua");
INSERT INTO Herriak VALUES("Barakaldo","Bizkaia",0,"Euskaltegiaren abestia");
INSERT INTO Herriak VALUES("Elantxobe","Bizkaia",1,"Aldapatsua");