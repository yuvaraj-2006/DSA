# Write your MySQL query statement below
SELECT p.firstname ,p.lastname,a.city,a.state FROM 
person p LEFT JOIN   Address a
ON a.personId=p.personId ;