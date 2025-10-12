SELECT ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) 
FROM Activity), 2) AS fraction
FROM Activity
where(player_id, DATE_SUB(event_date, INTERVAL 1 DAY)) IN(
    select player_id, MIN(event_date) AS first_login
    from Activity
    group by player_id
)
