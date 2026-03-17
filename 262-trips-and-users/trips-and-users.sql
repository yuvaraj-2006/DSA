# Write your MySQL query statement below
select t.request_at as Day , 
  Round(sum(case when t.status != 'completed' then 1 else 0 end)/count(*),2)
  as "Cancellation Rate" from 
  trips t join users c 
  on c.users_id =t.client_id join
  users d on t.driver_id = d.users_id 
  where c.banned!='Yes' and d.banned!='yes' and
  t.request_at between "2013-10-01" and "2013-10-03"
  group by t.request_at
  order by t.request_at;