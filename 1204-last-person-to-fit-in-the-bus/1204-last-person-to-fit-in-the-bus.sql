with cte1 as
(select *,sum(weight) over (order by turn) as total_weight
from Queue)
select person_name from cte1 where total_weight<=1000
order by turn desc
limit 1;