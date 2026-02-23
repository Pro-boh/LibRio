CREATE DATABASE librarydb;
USE librarydb;

CREATE TABLE Books (
    bookID INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL
);

CREATE TABLE Students (
    studID INT PRIMARY KEY,
    Fname VARCHAR(255) NOT NULL,
    Lname VARCHAR(255) NOT NULL
);

CREATE TABLE Staff (
    staffID INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO Books (bookID, name, author) VALUES (1, 'Harry Potter', 'J. K. Rowling');
INSERT INTO Books (bookID, name, author) VALUES (2, 'Lord of the Rings', 'J. R. R. Tolkien');
INSERT INTO Books (bookID, name, author) VALUES (3, 'Hobbit', 'J. R. R. Tolkien');
INSERT INTO Books (bookID, name, author) VALUES (4, 'Narnia', 'C. S. Lewis');
INSERT INTO Books (bookID, name, author) VALUES (5, 'Percy Jackson', 'Rick Riordan');

INSERT INTO Students (studID, Fname, Lname) VALUES (1, 'John', 'Diaz');
INSERT INTO Students (studID, Fname, Lname) VALUES (2, 'Harry', 'Perera');
INSERT INTO Students (studID, Fname, Lname) VALUES (3, 'Lisa', 'Alwis');
INSERT INTO Students (studID, Fname, Lname) VALUES (4, 'Sam', 'Lewis');
INSERT INTO Students (studID, Fname, Lname) VALUES (5, 'Percy', 'Smith');

INSERT INTO Staff (staffID, name) VALUES (1, 'Sam');
INSERT INTO Staff (staffID, name) VALUES (2, 'John');
INSERT INTO Staff (staffID, name) VALUES (3, 'Lily');
INSERT INTO Staff (staffID, name) VALUES (4, 'Nataliya');
INSERT INTO Staff (staffID, name) VALUES (5, 'Rex');
