
CREATE DATABASE jaegers;
CREATE TABLE robots (
id SERIAL PRIMARY KEY,
modelName TEXT,
mark CHAR(6),
height INTEGER,
weight INTEGER,
status TEXT,
origin TEXT,
launch TEXT,
kaijuKill INTEGER);