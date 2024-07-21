//BASE DE DATOS ORACLE 


CREATE TABLE CONTACTS (
    ID_CONTACT INT PRIMARY KEY,
    NAME_CONTACT VARCHAR2(100) NOT NULL,
    EMAIL_CONTACT VARCHAR2(100) NOT NULL,
    NUMBER_CONTACT VARCHAR2(20)
);


//CREA LA SECUENCIA DE IDS GENERADOS AUTOMATICAMENTE EN LA BD
CREATE SEQUENCE contacts_seq
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;
