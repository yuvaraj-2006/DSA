# Write your MySQL query statement below
SELECT(
   select distinct salary 
    FROM Employee
    ORDER BY salary desc LIMIT 1 offset 1
)  AS SecondHighestSalary; 