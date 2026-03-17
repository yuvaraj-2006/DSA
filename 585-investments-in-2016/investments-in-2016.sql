# Write your MySQL query statement below
with cte as (
    select *,
    count(*) over (partition by tiv_2015) as tiv2015,
    count(*) over (partition by lat,lon) as latlon
    from Insurance
)
select round(sum(tiv_2016),2)  as tiv_2016
from cte
where tiv2015 > 1 and 
latlon = 1 ;