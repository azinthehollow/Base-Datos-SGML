drop table Devolucion;
drop table Prestamo_Material;
drop table Laboratorio_Material;
drop table Material;
drop table Laboratorio;
drop table Prestamo;
drop table Encargados;
drop table Usuario;



CREATE TABLE Encargados
(
	idEncargado          INTEGER NOT NULL ,
	Nombre               VARCHAR2(20) NULL ,
	aPaterno             VARCHAR2(20) NULL ,
	aMaterno             VARCHAR2(20) NULL ,
	direccion            VARCHAR2(20) NULL 
);


ALTER TABLE Encargados
	ADD  PRIMARY KEY (idEncargado);

CREATE TABLE Laboratorio
(
	idLaboratorio        INTEGER NOT NULL ,
	nombre               VARCHAR2(20) NULL ,
	clave                VARCHAR2(20) NULL ,
	idEncargado          INTEGER NULL 
);



ALTER TABLE Laboratorio
	ADD  PRIMARY KEY (idLaboratorio);

CREATE TABLE Material
(
	idMaterial           INTEGER NOT NULL ,
	descripcion          VARCHAR2(20) NULL 
);



ALTER TABLE Material
	ADD  PRIMARY KEY (idMaterial);

CREATE TABLE Laboratorio_Material
(
	idLaboratorio        INTEGER NOT NULL ,
	idMaterial           INTEGER NOT NULL ,
	existencia           Number NULL 
);



ALTER TABLE Laboratorio_Material
	ADD  PRIMARY KEY (idLaboratorio,idMaterial);

CREATE TABLE Prestamo
(
	idPrestamo           INTEGER NOT NULL ,
	descripcion          VARCHAR2(20) NULL ,
	idUsuario            INTEGER NULL ,
	fecha                DATE NULL 
);



ALTER TABLE Prestamo
	ADD  PRIMARY KEY (idPrestamo);

CREATE TABLE Prestamo_Material
(
	idPrestamo           INTEGER NOT NULL ,
	idMaterial           INTEGER NOT NULL ,
	idLaboratorio        INTEGER NOT NULL 
);



ALTER TABLE Prestamo_Material
	ADD  PRIMARY KEY (idPrestamo,idMaterial,idLaboratorio);

CREATE TABLE Devolucion
(
	idDevolucion         INTEGER NOT NULL ,
	idPrestamo           INTEGER NOT NULL ,
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
	direccion            VARCHAR2(20) NULL ,
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


Insert into Encargados values(1, 'encargado1','apellido1','apellido2','calle1');

Insert into Encargados values(2, 'encargado2','apellido3','apellido4','calle2');

Insert into Encargados values(3, 'encargado3','apellido5','apellido6','calle3');

insert into Laboratorio values(1, 'laboratorio1', '123', 3);

insert into Laboratorio values(2, 'laboratorio1', '123', 2);

insert into Laboratorio values(3, 'laboratorio1', '123', 1);

insert into Material values (1, 'material 1');

insert into Material values (2, 'material 2');

insert into Material values (3, 'material 3');

insert into Laboratorio_Material values(1,2, 12);

insert into Laboratorio_Material values(2,3, 3);

insert into Laboratorio_Material values(3,2, 56);

insert into Laboratorio_Material values(1,1, 8);

insert into Laboratorio_Material values(2,2, 63);

insert into Usuario values(1, 'nombre', 'apaterno', 'amaterno', 'direccion', 5456312);

insert into Usuario values(2, 'nombre2', 'apaterno2', 'amaterno2', 'direccion2', 5455535);
