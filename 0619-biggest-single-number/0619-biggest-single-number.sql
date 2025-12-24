SELECT IFNULL(
    (SELECT num FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
    ORDER BY num DESC limit 1),
NULL) AS num