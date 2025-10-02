select e.name, b.bonus
from Employee e
LEFT JOIN bonus b
ON e.empID = b.empID
WHERE b.bonus < 1000 OR b.bonus IS NULL