select e.name, i.unique_id 
from Employees e
LEFT JOIN EmployeeUNI i
ON e.id = i.id
