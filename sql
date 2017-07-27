drop schema if exists Foodway;
create schema Foodway;


drop database if exists Bookings;
create database Bookings;
Use Bookings;

CREATE TABLE Reservations (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
timeslot time NOT NULL,
reservationName VARCHAR(30),
Available boolean
);


INSERT INTO Reservations (timeslot, Available)
VALUES ('110000', 1), ('113000', 1), ('120000', 1), ('123000', 1),
('130000', 1), ('143000', 1), ('150000', 1), ('153000', 1),
('160000', 1), ('163000', 1), ('170000', 1), ('173000', 1),
('180000', 1), ('183000', 1), ('190000', 1), ('193000', 1),
('200000', 1), ('203000', 1), ('210000', 1), ('213000', 1);
