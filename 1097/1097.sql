
SELECT s.player_id, a.event_date AS first_login
FROM Activity a
JOIN (SELECT player_id, MIN(event_date) AS first_date FROM Activity GROUP BY player_id) s
ON a.player_id = s.player_id AND a.event_date = DATE_ADD(s.first_date, INTERVAL 1 DAY)
