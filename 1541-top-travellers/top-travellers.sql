# Write your MySQL query statement below
select u.name, ifnull(sum(t.distance),0) as 
travelled_distance from Users u left join Rides t on
u.id = t.user_id group by t.user_id order by travelled_distance desc,u.name;
