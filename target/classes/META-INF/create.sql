set search_path to alexc;

CREATE TABLE departaments
         (	numDept INTEGER,
	nomDept varchar(255),
	plantaD INTEGER,
	edificiD varchar(255),
	ciutatD varchar(255),
	PRIMARY KEY (numDept));

CREATE TABLE empleats
         (	numEmpl INTEGER,
	nomEmpl varchar(255),
	souE INTEGER,
	ciutatE varchar(255),
	numDeptE INTEGER,
	PRIMARY KEY (numEmpl),
	FOREIGN KEY (numDeptE) REFERENCES departaments (numDept));