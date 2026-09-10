# Write your MySQL query statement below
SELECT product_name, year, price from Sales
INNER JOIN Product
on Product.product_id = Sales.product_id;