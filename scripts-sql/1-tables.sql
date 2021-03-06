SET search_path TO nounous;


-- Schéma

DROP SCHEMA IF EXISTS nounous CASCADE;
CREATE SCHEMA nounous AUTHORIZATION nounous;
GRANT ALL PRIVILEGES ON SCHEMA nounous TO nounous;


-- Tables

CREATE TABLE compte (
	IdCompte		INT			 	NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	Pseudo			VARCHAR(25)		NOT NULL,
	MotDePasse		VARCHAR(25) 	NOT NULL,
	Email			VARCHAR(100)	NOT NULL,
	PRIMARY KEY (IdCompte)
);
CREATE UNIQUE INDEX idx_compte_pseudo ON compte (Pseudo ASC);

CREATE TABLE role (
	IdCompte		INT				NOT NULL,
	Role			VARCHAR(20)		NOT NULL,
	CHECK( Role IN ('ADMINISTRATEUR','UTILISATEUR') ),	
	FOREIGN KEY (IdCompte) REFERENCES compte (IdCompte),
	PRIMARY KEY (IdCompte, Role)
);

CREATE TABLE categorie (
	IdCategorie		INT				NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	Libelle			VARCHAR(25)		NOT NULL,
	PRIMARY KEY (IdCategorie)
);

CREATE TABLE personne (
	IdPersonne		INT				NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	IdCategorie		INT				NOT NULL,
	Nom				VARCHAR(25)  	NOT NULL,
	Prenom			VARCHAR(25) 	NOT NULL,
	FOREIGN KEY (IdCategorie) REFERENCES categorie (IdCategorie),
	PRIMARY KEY (IdPersonne)
);

CREATE TABLE telephone (
	IdTelephone		INT				NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
	IdPersonne		INT			 	NOT NULL,
	Libelle			VARCHAR(25)		NOT NULL,
	Numero			VARCHAR(25)		NOT NULL,
	FOREIGN KEY (IdPersonne) REFERENCES personne (IdPersonne),
	PRIMARY KEY (IdTelephone)
);

-- new tables 

CREATE TABLE enfant(
   id INT     NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
   nom VARCHAR(50),
   prenom VARCHAR(50),
   date_inscription DATE,
   date_naissance DATE NOT NULL,
   sexe VARCHAR(50) NOT NULL,
   allergie VARCHAR(50),
   infos VARCHAR(50),
   PRIMARY KEY(id)
);

CREATE TABLE parent(
   id INT     NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
   nom VARCHAR(50) NOT NULL,
   prenom VARCHAR(50) NOT NULL,
   date_naissance VARCHAR(50),
   password VARCHAR(50) NOT NULL,
   numero_cni VARCHAR(50) NOT NULL,
   caracteristiques VARCHAR(50),
   email VARCHAR(50) NOT NULL,
   telephone VARCHAR(50) NOT NULL,
   adresse VARCHAR(50) NOT NULL,
   PRIMARY KEY(id)
);



CREATE TABLE nounous(
   id INT     NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
   nom VARCHAR(50) NOT NULL,
   prenom VARCHAR(50) NOT NULL,
   telephone VARCHAR(50) NOT NULL,
   adresse VARCHAR(50) NOT NULL,
   email VARCHAR(50) NOT NULL,
   password VARCHAR(50) NOT NULL,
   tarif_horaire DECIMAL(15,2) NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE contrat(
   id INT     NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
   date_debut DATE NOT NULL,
   date_fin DATE,
   specifications VARCHAR(50),
   id_enfant INT NOT NULL,
   id_nounous INT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(id_nounous) REFERENCES nounous(id),
   FOREIGN KEY(id_enfant) REFERENCES enfant(id)
);
CREATE TABLE inscription(
   id_enfant INT,
   id_parent INT,
   PRIMARY KEY(id_enfant, id_parent),
   FOREIGN KEY(id_enfant) REFERENCES enfant(id),
   FOREIGN KEY(id_parent) REFERENCES parent(id)
);

CREATE TABLE garde(
	id INT     NOT NULL	GENERATED BY DEFAULT AS IDENTITY,
   id_enfant INT,
   id_nounous INT,
   date_garde DATE NOT NULL,
   heure_arrivee TIME NOT NULL,
   repas VARCHAR(10) NOT NULL,
   heure_depart TIME,
   PRIMARY KEY(id),
   FOREIGN KEY(id_enfant) REFERENCES enfant(id),
   FOREIGN KEY(id_nounous) REFERENCES nounous(id)
);


