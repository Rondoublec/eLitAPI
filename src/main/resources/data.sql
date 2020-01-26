-- le mot de passe de chaque user est 12345
INSERT INTO USER (ID,ACTIVE,EMAIL,LAST_NAME,NAME,PASSWORD) VALUES (100,TRUE,'alain@a.a','Admin','Alain','$2a$10$XAOiM6rLRrzMfF4jNsQc7O8jurI4BORxgh6cEGV0k9gymUfjYZx9a');
INSERT INTO USER (ID,ACTIVE,EMAIL,LAST_NAME,NAME,PASSWORD) VALUES (200,TRUE,'ursula@a.a','User','Ursula','$2a$10$2rCrmX.jiEAF1cLdDJduBOAj2qiim6bu9mKF86I3YvrHwNJqvijYW');
INSERT INTO USER (ID,ACTIVE,EMAIL,LAST_NAME,NAME,PASSWORD) VALUES (300,TRUE,'maurice@a.a','Membre','Maurice','$2a$10$jUmvMaNIcH6xE3M8TRp6suTYNmBR08/SBXQ.7iiyTZCa3IWG1o0q6');
INSERT INTO USER (ID,ACTIVE,EMAIL,LAST_NAME,NAME,PASSWORD) VALUES (400,TRUE,'u2@a.a','User2','Ulrich','$2a$10$r5LYG4bcXnFQfXSUFXWLIu8rzSqdOfHPD/SZ9/jJj6aZSXjpAtAsu');
INSERT INTO USER (ID,ACTIVE,EMAIL,LAST_NAME,NAME,PASSWORD) VALUES (500,TRUE,'u3@a.a','User3','Urbain','$2a$10$KicK13YZIjKkmptOwXACg.85TD6d8zcfxN2WcgEWbku5asdgfdvcu');
INSERT INTO USER (ID,ACTIVE,EMAIL,LAST_NAME,NAME,PASSWORD) VALUES (600,TRUE,'m1@a.a','Membre1','Manu','$2a$10$6HdfSXRm2fhvLc6BJQEmPunFIc6hWY94X9/DLQUaHNvc5AAyq/vLO');

INSERT INTO ROLE (ROLE_ID,ROLE) VALUES (101,'ADMIN');
INSERT INTO ROLE (ROLE_ID,ROLE) VALUES (201,'USER');
INSERT INTO ROLE (ROLE_ID,ROLE) VALUES (301,'PERSONNEL');
INSERT INTO ROLE (ROLE_ID,ROLE) VALUES (401,'USER');
INSERT INTO ROLE (ROLE_ID,ROLE) VALUES (501,'USER');
INSERT INTO ROLE (ROLE_ID,ROLE) VALUES (601,'PERSONNEL');

INSERT INTO USER_ROLE (USER_ID,ROLE_ID) VALUES (100,101);
INSERT INTO USER_ROLE (USER_ID,ROLE_ID) VALUES (200,201);
INSERT INTO USER_ROLE (USER_ID,ROLE_ID) VALUES (300,301);
INSERT INTO USER_ROLE (USER_ID,ROLE_ID) VALUES (400,401);
INSERT INTO USER_ROLE (USER_ID,ROLE_ID) VALUES (500,501);
INSERT INTO USER_ROLE (USER_ID,ROLE_ID) VALUES (600,601);

INSERT INTO OUVRAGE (OUVRAGE_ID,OUVRAGE_AUTEUR,OUVRAGE_LOCALISATION,OUVRAGE_QUANTITE,OUVRAGE_REFERENCE,OUVRAGE_RESUME,OUVRAGE_STYLE,OUVRAGE_TITRE)
VALUES (1000,'Auteur 1000','Etage 1000 Casier 1000',1000,'REF1000','C''est l''histoire d''un mec ...','Humour','The story of a guy');
INSERT INTO OUVRAGE (OUVRAGE_ID,OUVRAGE_AUTEUR,OUVRAGE_LOCALISATION,OUVRAGE_QUANTITE,OUVRAGE_REFERENCE,OUVRAGE_RESUME,OUVRAGE_STYLE,OUVRAGE_TITRE)
VALUES (2000,'Auteur 2000','Etage 2000 Casier 2000',2000,'REF2000','C''est l''histoire de 2 mecs ...','Humour','The story of a guy 2');
INSERT INTO OUVRAGE (OUVRAGE_ID,OUVRAGE_AUTEUR,OUVRAGE_LOCALISATION,OUVRAGE_QUANTITE,OUVRAGE_REFERENCE,OUVRAGE_RESUME,OUVRAGE_STYLE,OUVRAGE_TITRE)
VALUES (3000,'Auteur 3000','Etage 3000 Casier 3000',3000,'REF3000','C''est l''histoire de 3 mecs ...','Humour','The story of a guy 3');

INSERT INTO EMPRUNT (EMPRUNT_ID,EMPRUNT_DATE_DEBUT,EMPRUNT_DATE_FIN,EMPRUNT_DATE_PROLONGATION,EMPRUNT_DATE_RETOUR,OUVRAGE_EMPRUNT_OUVRAGE_ID,USER_EMPRUNT_ID)
VALUES (4000,'2020-01-02 14:00:00.000','2020-01-30 14:00:00.000',NULL,NULL,2000,200);

