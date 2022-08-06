-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS jobberApplication;
CREATE DATABASE jobberApplication;
--USE jobberApplication;--


-- -----------------------------------------------------------------------------
-- - Construction de la table des utilisateurs                               ---
-- -----------------------------------------------------------------------------
CREATE TABLE Account (
    idAccount              int         PRIMARY KEY AUTO_INCREMENT,
    login               varchar(20) NOT NULL,
    password            varchar(20) NOT NULL,
);

INSERT INTO Account (idAccount, login, password) VALUES ( 1, 'Anderson',   'Neo' );
INSERT INTO Account (idAccount, login, password) VALUES ( 2, 'Skywalker',  'Luke' );
INSERT INTO Account (idAccount, login, password) VALUES ( 3, 'Plissken',   'Snake' );
INSERT INTO Account (idAccount, login, password) VALUES ( 4, 'Ripley',     'Ellen' );
INSERT INTO Account (idAccount, login, password) VALUES ( 5, 'Bond',       'James' );

SELECT * FROM Account;

-- -----------------------------------------------------------------------------
-- - Construction de la table des informations des utilisateurs                                                       ---
-- -----------------------------------------------------------------------------
CREATE TABLE AccountInfo (
    idAccountInfo  int      PRIMARY KEY AUTO_INCREMENT,
    idAccount      int      NOT NULL REFERENCES Account(idAccount),
    address         text,
    city            text,
    email           text,
    phoneNumber     text
);

INSERT INTO AccountInfo (idAccount, email, phoneNumber, address, city) 
VALUES ( 1, 'neo@matrix.com', '1234567890', 'rue du Faucon','Brazzaville' ),
       ( 2, 'luke@glaforce.wars', '0147258369', 'rue du Faucon',  'Castille'),
       ( 3, 'snake@carpenter.com', '9638527410' , 'rue de la barre', 'New York'),
       ( 4, 'ripley@nostromo.alien', '9876543210' , 'Nostromo', 'Nkayi'),
       ( 5, '007@mi6.uk',  '7007007007', 'SIS Building', 'London');

SELECT * FROM AccountInfo;

-- -----------------------------------------------------------------------------
-- - Construction de la table des roles                                      ---
-- -----------------------------------------------------------------------------

CREATE TABLE Role (
    idRole       int         PRIMARY KEY AUTO_INCREMENT,
    roleName     varchar(20) NOT NULL
);

INSERT INTO Role (roleName)
VALUES ('ROLE_ENTREPRISE'), ('ROLE_APPLICANT'), ('ROLE_ADMIN');

SELECT * FROM Role;

-- -----------------------------------------------------------------------------
-- - Construction de la table d'association compte/role               ---
-- -----------------------------------------------------------------------------

CREATE TABLE Account_Roles (
    idUser   int    NOT NULL REFERENCES Account(idAccount),
    idRole   int    NOT NULL REFERENCES Account(idRole)
);

INSERT INTO Account_Roles 
VALUES (1, 2), (1, 3), (2, 1), (3, 1), (4, 1), (5, 2);

SELECT * FROM Account_Roles;







-- -----------------------------------------------------------------------------
-- - Construction de la table des comptes entreprises                          ---
-- -----------------------------------------------------------------------------

CREATE TABLE EntrepriseAccount (
    idAccount           int          NOT NULL REFERENCES Account(idAccount),
    entitled       varchar(30)
);

INSERT INTO EntrepriseAccount VALUES ( 1, 'A fake paypal account' );

SELECT * FROM EntrepriseAccount;

-- -----------------------------------------------------------------------------
-- - Construction de la table des comptes candidats            ---
-- -----------------------------------------------------------------------------

CREATE TABLE ApplicantAccount (
    idAccount           int          NOT NULL REFERENCES Account(idAccount),
	firstname			varchar(30),
	lastname 			varchar(30)
);

INSERT INTO ApplicantAccount VALUES ( 2, '1234 5678 9012 3456', '06/19' );

SELECT * FROM ApplicantAccount;