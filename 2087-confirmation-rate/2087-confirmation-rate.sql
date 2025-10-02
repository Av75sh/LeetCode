select s.user_id, IFNULL(ROUND(SUM(action = 'confirmed')/ COUNT(*), 2), 0.00) 
AS confirmation_rate 
from Signups s
LEFT JOIN Confirmations c
ON s.user_id = c.user_id
GROUP BY user_id