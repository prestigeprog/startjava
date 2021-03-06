SELECT * FROM robots;
SELECT * FROM robots WHERE status = 'NotDestroyed';
SELECT * FROM robots WHERE mark IN ('Mark-1', 'Mark-6');
SELECT * FROM robots ORDER BY mark DESC;
SELECT * FROM robots WHERE launch = (SELECT MAX(launch) FROM robots);
SELECT * FROM robots WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM robots);
SELECT * FROM robots WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM robots);
SELECT AVG(weight) FROM robots;
UPDATE robots SET kaijuKill = kaijuKill + 1 WHERE status = 'NotDestroyed';
DELETE FROM robots WHERE status = 'Destroyed';