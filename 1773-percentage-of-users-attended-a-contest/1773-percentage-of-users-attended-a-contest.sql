# Write your MySQL query statement 
select r.contest_id, ROUND(COUNT(r.contest_id)/(select COUNT(user_id) from Users)*100, 2) AS percentage
FROM Register r
JOIN Users u
ON r.user_id = u.user_id
group by contest_id
order by percentage DESC, contest_id ASC