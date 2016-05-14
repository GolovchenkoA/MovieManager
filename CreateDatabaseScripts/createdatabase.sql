CREATE SCHEMA `movie_1` ;


CREATE TABLE movie_1.MOVIES
(
    ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    TITLE VARCHAR(40) DEFAULT "no title" NOT NULL,
    DIRECTOR VARCHAR(60) DEFAULT "no director" NOT NULL,
    SYNOPSIS VARCHAR(255) DEFAULT "no synopsis" NOT NULL
);