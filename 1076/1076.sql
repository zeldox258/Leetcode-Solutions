
SELECT project_id FROM Project
GROUP BY project_id
HAVING COUNT(*) = (SELECT COUNT(*) FROM Project GROUP BY project_id ORDER BY COUNT(*) DESC LIMIT 1)
