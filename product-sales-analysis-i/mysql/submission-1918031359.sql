# Write your MySQL query statement below
SELECT product_name, year, price from Sales
INNER JOIN Product
on product_id = product_id;