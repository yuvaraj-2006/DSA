# Write your MySQL query statement below
(select u.name as results from users u join (
select user_id , count(*) as Movies_rated 
from MovieRating group by user_id 
) m_r on u.user_id=m_r.user_id
order by m_r.movies_rated desc,u.name asc limit 1)
union all (
select m.title from  Movies m join (
select movie_id ,Avg(rating) as av 
from MovieRating 
 WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
group by movie_id  )
t on m.movie_id=t.movie_id order by t.av desc,m.title limit 1);
