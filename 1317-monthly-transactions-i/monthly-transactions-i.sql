# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date,"%Y-%m") AS month,
t.country,count(state) AS trans_count,
sum(state='approved') AS approved_count,
sum(amount) AS trans_total_amount,
sum(CASE WHEN state='approved' THEN amount ELSE 0 end ) AS approved_total_amount
FROM Transactions t 
GROUP BY month,t.country;