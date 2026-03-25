# Write your MySQL query statement below
select
    case 
        when income < 20000 then "Low Salary" 
        when income >50000 then "High Salary"
        Else "Average Salary" end 
        as category,count(*) as accounts_count
         from Accounts 
         group by category 

 union all 
 select 'Average Salary' as category ,
    0 as accounts_count
    where not exists(
        select 1 
        from Accounts where 
        income between 20000 and 50000
    )
    
     union all 
 select 'Low Salary' as category ,
    0 as accounts_count
    where not exists(
        select 1 
        from Accounts where 
        income  < 20000 
    )
     union all 
 select 'High Salary' as category ,
    0 as accounts_count
    where not exists(
        select 1 
        from Accounts where 
        income  > 50000
    )

   