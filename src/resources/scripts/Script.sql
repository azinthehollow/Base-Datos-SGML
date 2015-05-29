drop table Devolucion cascade constraints;
drop table Prestamo_Material cascade constraints;
drop table Laboratorio_Material cascade constraints;
drop table Material cascade constraints;
drop table Laboratorio cascade constraints;
drop table Prestamo cascade constraints;
drop table Encargados cascade constraints;
drop table Usuario cascade constraints;



CREATE TABLE Encargados
(
	idEncargado          INTEGER NOT NULL ,
	Nombre               VARCHAR2(20) NULL ,
	aPaterno             VARCHAR2(20) NULL ,
	aMaterno             VARCHAR2(20) NULL ,
	direccion            VARCHAR2(50) NULL 
);


ALTER TABLE Encargados
	ADD  PRIMARY KEY (idEncargado);

CREATE TABLE Laboratorio
(
	idLaboratorio        INTEGER NOT NULL ,
	nombre               VARCHAR2(25) NULL ,
	clave                VARCHAR2(20) NULL ,
	idEncargado          INTEGER NULL 
);



ALTER TABLE Laboratorio
	ADD  PRIMARY KEY (idLaboratorio);

CREATE TABLE Material
(
	idMaterial           INTEGER NOT NULL ,
	descripcion          VARCHAR2(100) NULL 
);



ALTER TABLE Material
	ADD  PRIMARY KEY (idMaterial);

CREATE TABLE Laboratorio_Material
(
	idLaboratorio        INTEGER NOT NULL ,
	idMaterial           INTEGER NOT NULL ,
	existencia           INTEGER NULL
);



ALTER TABLE Laboratorio_Material
	ADD  PRIMARY KEY (idLaboratorio,idMaterial);

CREATE TABLE Prestamo
(
	idPrestamo           INTEGER NOT NULL ,
	descripcion          VARCHAR2(100) NULL ,
	idUsuario            INTEGER NULL ,
	fecha                DATE NULL 
);



ALTER TABLE Prestamo
	ADD  PRIMARY KEY (idPrestamo);

CREATE TABLE Prestamo_Material
(
	idPrestamo           INTEGER NOT NULL ,
	idMaterial           INTEGER NOT NULL ,
	idLaboratorio        INTEGER NOT NULL,
        cantidad        INTEGER NOT NULL
);



ALTER TABLE Prestamo_Material
	ADD  PRIMARY KEY (idPrestamo,idMaterial,idLaboratorio);

CREATE TABLE Devolucion
(
	idDevolucion         INTEGER NOT NULL  UNIQUE,
	idPrestamo           INTEGER NOT NULL UNIQUE,
	status               VARCHAR2(20) NULL 
);



ALTER TABLE Devolucion
	ADD  PRIMARY KEY (idDevolucion,idPrestamo);

CREATE TABLE Usuario
(
	idUsuario            INTEGER NOT NULL ,
	nombre               VARCHAR2(20) NULL ,
	aPaterno             VARCHAR2(20) NULL ,
	aMaterno             VARCHAR2(20) NULL ,
	direccion            VARCHAR2(50) NULL ,
	telefono             VARCHAR2(20) NULL 
);


ALTER TABLE Usuario
	ADD  PRIMARY KEY (idUsuario);

ALTER TABLE Laboratorio
	ADD (FOREIGN KEY (idEncargado) REFERENCES Encargados (idEncargado));

ALTER TABLE Laboratorio_Material
	ADD (FOREIGN KEY (idLaboratorio) REFERENCES Laboratorio (idLaboratorio));

ALTER TABLE Laboratorio_Material
	ADD (FOREIGN KEY (idMaterial) REFERENCES Material (idMaterial));

ALTER TABLE Prestamo
	ADD (FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario));

ALTER TABLE Prestamo_Material
	ADD (FOREIGN KEY (idPrestamo) REFERENCES Prestamo (idPrestamo));

ALTER TABLE Prestamo_Material
	ADD (FOREIGN KEY (idMaterial) REFERENCES Material (idMaterial));

ALTER TABLE Prestamo_Material
	ADD (FOREIGN KEY (idLaboratorio, idMaterial) REFERENCES Laboratorio_Material (idLaboratorio, idMaterial));

ALTER TABLE Devolucion
	ADD (FOREIGN KEY (idPrestamo) REFERENCES Prestamo (idPrestamo));

