# Write your MySQL query statement below
select c.name as Customers
from Customers c
Left Join Orders o
On c.id=o.customerid
where o.id is null;