SET search_path TO nounous;


-- Supprime toutes les données
DELETE FROM telephone;
DELETE FROM personne;
DELETE FROM categorie;
DELETE FROM role;
DELETE FROM compte;



-- Insère les données

INSERT INTO compte (IdCompte, Pseudo, MotDePasse, Email ) VALUES 
  (1, 'geek', 'geek', 'geek@3il.fr' ),
  (2, 'chef', 'chef', 'chef@3il.fr' ),
  (3, 'job', 'job', 'job@3il.fr' );

ALTER TABLE compte ALTER COLUMN IdCompte RESTART WITH 4;

  
INSERT INTO role (IdCompte, Role) VALUES 
  ( 1, 'ADMINISTRATEUR' ),
  ( 1, 'UTILISATEUR' ),
  ( 2, 'UTILISATEUR' ),
  ( 3, 'UTILISATEUR' );
  
  
INSERT INTO categorie (IdCategorie, Libelle ) VALUES 
  (1, 'Employés' ),
  (2, 'Partenaires' ),
  (3, 'Clients'),
  (4, 'Fournisseurs' ),
  (5, 'Dirigeants' );

ALTER TABLE categorie ALTER COLUMN IdCategorie RESTART WITH 6;
  
  
INSERT INTO personne (IdPersonne, IdCategorie, Nom, Prenom) VALUES 
  ( 1, 1, 'DESVALOIS', 'Christian' ),
  ( 2, 1, 'BELABDELLI', 'Fethi' ),
  ( 3, 1, 'AMBLARD', 'Emmanuel' );

ALTER TABLE personne ALTER COLUMN IdPersonne RESTART WITH 4;
  

INSERT INTO telephone (IdTelephone, IdPersonne, Libelle, Numero ) VALUES 
  ( 11, 1, 'Portable', '06 11 11 11 11' ),
  ( 12, 1, 'Fax', '05 55 99 11 11' ),
  ( 13, 1, 'Bureau', '05 55 11 11 11' ),
  ( 21, 2, 'Portable', '06 22 22 22 22' ),
  ( 22, 2, 'Fax', '05 55 99 22 22' ),
  ( 23, 2, 'Bureau', '05 55 22 22 22' ),
  ( 31, 3, 'Portable', '06 33 33 33 33' ),
  ( 32, 3, 'Fax', '05 55 99 33 33' ),
  ( 33, 3, 'Bureau', '05 55 33 33 33' );

ALTER TABLE telephone ALTER COLUMN IdTelephone RESTART WITH 100;
 
-- new data

INSERT INTO nounous (nom, prenom, telephone, adresse,email,password,tarif_horaire) VALUES 
  ('mouaffo','zidane','0752337571','29 strasbourg','zidtakoumbo@gmail.com','1234',25.5 ),
  ('Nkeuzing','Arianne','0752337571','29 strasbourg','nkeuzina@3il.fr','1234',45.5 ),
  ('nanda','vianney','0752337571','29 strasbourg','nandav@3il.fr','1234',30.5 ),
  ('toukam','linchou','0752337571','6 elysée','toukaml@3il.frm','1234',10.0 );


 INSERT INTO enfant (nom, prenom,date_inscription,date_naissance,sexe,allergie,infos) VALUES 
  ('kameni','maella','14-07-2000','28-01-1999','F','crevette','bb delicat' ),
  ('tchoungo','brice','14-07-2000','28-01-1999','M','crevette','bb delicat' ),
  ('mukam','vichal','14-07-2000','28-01-1999','M','porc','trop riche' ),
  ('mapsou','vanessa laure','14-07-2000','28-01-1999','F','crevette','bb delicat' );
  
INSERT INTO parent ( nom, prenom, date_naissance, password, numero_cni, caracteristiques, email, telephone, adresse) VALUES
('Tsague', 'alex', '1996-03-22', 'alex', '111-111-111-111', 'a la voiture', 'alex@3il.fr', '0752337571', '29 rue du pain chargé 87100 Limoges '),
('Morena Magne', 'sosso', '1999-10-10', 'sosso', '111-111-111-112', 'riche ', 'sosso@3il.fr', '0752337571', '35 rue de Dubai 87100 limoges');


INSERT INTO inscription (id_enfant, id_parent) VALUES
(1, 2),
(2, 1),
(3, 1),
(4, 2);

INSERT INTO contrat ( date_debut, date_fin, specifications, id_enfant, id_nounous) VALUES 
( '2022-05-01', NULL, 'ras', '1', '1'),
( '2022-05-01', NULL, 'ras', '4', '1'),
('2022-05-03', NULL, 'ras', '3', '2');


INSERT INTO garder (id_enfant, id_nounous, date_garde, heure_arrivee, repas, heure_depart) VALUES 
('1', '1', '2022-06-10', '10:00:00', 'yes', '17:00:00'), 
('4', '1', '2022-06-10', '07:00:00', 'no', '17:30:00');

