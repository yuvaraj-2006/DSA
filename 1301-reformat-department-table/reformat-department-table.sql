# Write your MySQL query statement below
select id,
   sum(case when month='jan' then revenue End) As Jan_Revenue,
   sum(case when month='feb' then revenue End) As Feb_Revenue,
   sum(case when month='Mar' then revenue End) As Mar_Revenue,
   sum(case when month='apr' then revenue End) As Apr_Revenue,
   sum(case when month='may' then revenue End) As May_Revenue,
   sum(case when month='Jun' then revenue End) As Jun_Revenue,
   sum(case when month='Jul' then revenue End) As Jul_Revenue,
   sum(case when month='Aug' then revenue End) As Aug_Revenue,
   sum(case when month='Sep' then revenue End) As Sep_Revenue,
   sum(case when month='Oct' then revenue End) As Oct_Revenue,
   sum(case when month='Nov' then revenue End) As Nov_Revenue,
   sum(case when month='Dec' then revenue End) As Dec_Revenue
   from Department 
   GROUP BY id;