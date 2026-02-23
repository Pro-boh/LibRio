CREATE DATABASE LibraryManagement;

USE LibraryManagement;

CREATE TABLE Books (
    bookID INT PRIMARY KEY,
    name VARCHAR(255),
    author VARCHAR(255)
);

CREATE TABLE Students (
    studID INT PRIMARY KEY,
    Fname VARCHAR(255),
    Lname VARCHAR(255)
);

CREATE TABLE Staff (
    staffID INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE Checkouts (
    bookID INT,
    checkoutDate DATE,
    dueDate DATE,
    PRIMARY KEY (bookID, checkoutDate),
    FOREIGN KEY (bookID) REFERENCES Books(bookID)
);

CREATE TABLE Checkins (
    bookID INT,
    checkinDate DATE,
    PRIMARY KEY (bookID, checkinDate),
    FOREIGN KEY (bookID) REFERENCES Books(bookID)
);
