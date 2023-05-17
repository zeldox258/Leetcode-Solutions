
SELECT book_id, name FROM Books
WHERE book_id NOT IN (
    SELECT DISTINCT book_id FROM Orders
    WHERE dispatch_date BETWEEN '2018-06-23' AND '2019-06-23'
    GROUP BY book_id HAVING SUM(quantity) >= 10
)
AND available_from <= '2019-05-23'
