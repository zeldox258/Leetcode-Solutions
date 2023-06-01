
SELECT seller_id FROM Sales
GROUP BY seller_id
HAVING SUM(price) = (SELECT MAX(total) FROM (SELECT SUM(price) AS total FROM Sales GROUP BY seller_id) t)
