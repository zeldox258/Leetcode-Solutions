
SELECT b.buyer_id FROM Buyer b
JOIN Orders o ON b.buyer_id=o.buyer_id
JOIN Item i ON o.item_id=i.item_id
WHERE i.item_brand = 'Apple'
AND b.buyer_id NOT IN (
    SELECT o2.buyer_id FROM Orders o2 JOIN Item i2 ON o2.item_id=i2.item_id WHERE i2.item_brand='Samsung'
)
