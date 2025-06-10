SELECT 
    l.book_id, 
    l.title, 
    l.author, 
    l.genre, 
    l.publication_year, 
    l.total_copies AS current_borrowers
FROM 
    library_books l
WHERE 
    l.total_copies = (
        SELECT COUNT(*) 
        FROM borrowing_records br
        WHERE 
            br.return_date IS NULL 
            AND br.book_id = l.book_id
        GROUP BY br.book_id
    )
ORDER BY 
    current_borrowers DESC, 
    l.title ASC;