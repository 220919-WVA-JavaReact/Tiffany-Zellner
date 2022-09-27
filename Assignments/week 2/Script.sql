-- This is a comment in SQL

-- We use SQL to interact with databases
-- So we need to define the structure of the database before we can start adding information to it

-- SQL provides a variety of ways to start but the simplest is to just create a table

-- In SQL to create a table we need a couple things
-- We need a table name
-- we need columns
-- we need datatypes

-- what is a datatype?
-- a specific type of data the information has to conform to

-- SQL has a large variety of datatypes
-- datatypes you'll use
-- Boolean - True or False
-- Integers - positive or negative whole number
-- Varchar(n) - This is a string (text) that can be UP TO n characters long
-- Char(n) - This is a string (text) that MUST BE n characters long
CREATE TABLE products (
-- All of my column definitions must fit within here
-- columnName dataType
	productName varchar(25),
	productPrice int,
	department varchar(25),
	quantity int
);

-- CTRL + Enter allows you to run the command
CREATE TABLE pokemon(
-- pokedex number, name, type1, type2, level, evolved
-- To specify column names that are also keywords, it is best practice to put them in double quotes
	"number" int,
	"name" varchar(20),
	type1 varchar(10),
	type2 varchar(10),
	"level" int,
	evolved bool
);

-- SQL has a couple different types of sublanguages within it
-- There are 4 or 5 depending on who you ask (vendor specific generally)
-- For our purposes we consider 5

-- DDL: Data Definition Language- Defining and manipulating structure or schema for our database (like CREATE TABLE)

-- DML: Data Manipulation Language- ways to manipulate data (what we call CRUD methods)
-- CRUD: create, read, update, delete
-- create new data --> INSERT
-- read existing data --> SELECT
-- update existing data --> UPDATE
-- delete existing data --> DELETE

-- To create new data we are going to insert into a table and specify the values we want to add 

-- Let's add info into the products table
-- When adding strings (text) we use single quotes, not double quotes
INSERT INTO products VALUES ('Bike', 100, 'Sports', 1);

-- Let's take a look at how our datatypes enforce the right type of info in each column
-- INSERT INTO products VALUES ('Toaster', 'Forty dollars', 'Kitchen', 5)
INSERT INTO products VALUES ('Toaster', 40, 'Kitchen', 5);

-- Let's try adding stuff to some columns specifically but not all of them
INSERT INTO products (productName, productPrice, department) VALUES ('Tomato', 1, 'Produce');

INSERT INTO pokemon VALUES (1, 'Bulbasaur', 'Grass', 'Poison', 23, False);
INSERT INTO pokemon VALUES (3, 'Venasaur', 'Grass', 'Poison', 38, True);

CREATE TABLE countries (
	country varchar(45),
	avg_life_expectancy FLOAT,
	population BIGINT,
	"area" BIGINT,
	urban_population int
);

INSERT INTO countries VALUES ('Honduras', 75.87, 9904607, 111890, 57);
INSERT INTO countries VALUES ('Japan', 85.03, 126476461, 364555, 92);
INSERT INTO countries VALUES ('Macao', 84.68, 649335, 30);
INSERT INTO countries VALUES ('Switzerland', 84.25, 8654622, 39516, 74);
INSERT INTO countries VALUES ('Singapore', 84.07, 5850342, 700);
