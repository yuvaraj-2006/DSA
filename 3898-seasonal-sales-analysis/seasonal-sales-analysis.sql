# Write your MySQL query statement below
with cte as (
select case 
       when MONTH(s.sale_date) in (09,10,11) then 'Fall' 
       when MONTH(s.sale_date) in (12,01,02) then 'Winter'
       when MONTH(s.sale_date) in (03,04,05) then 'Spring'
       else 'Summer' end as season , p.category,sum(s.quantity) as  total_quantity ,
       sum(s.quantity * s.price) as total_revenue from Products p join sales s 
       on p.product_id=s.product_id group by season,p.category 
   ),
   ranked_data as (
    select *,row_number() over (partition by season 
       order by
            total_quantity desc,
            total_revenue desc ,
              category asc
               ) as rn
        from cte
   )
   select season,category,total_quantity,total_revenue 
   from ranked_data 
   where rn=1
   ORDER BY 
    CASE 
        WHEN season = 'Fall' THEN 1
        WHEN season = 'Spring' THEN 2
        WHEN season = 'Summer' THEN 3
        ELSE 4
    END;