# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers
WHERE ID NOT IN(
    SELECT customerID FROM orders
)
