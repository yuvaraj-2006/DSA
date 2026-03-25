# Write your MySQL query statement below
select round(count(distinct a.player_id)*1.0/(select count(distinct player_id) from Activity),2)as fraction from Activity a join (
    select player_id,
    min(event_date) as first_date 
    from Activity group by player_id 
)t 
on a.player_id=t.player_id and 
a.event_date=DATE_ADD(t.first_date,INTERVAL 1 DAY);