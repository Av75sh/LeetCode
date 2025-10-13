delete p1
from Person p1 inner join Person p2
where p1.email = p2.email AND
p1.id > p2.id