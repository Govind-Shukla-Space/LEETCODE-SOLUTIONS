# Write your MySQL query statement below
-- Write your MySQL query statement below  
with first_login(player_id,first_login) as (  
    select player_id  , min(event_date) as first_login  
    from Activity  
    group by player_id  
),consecutive (player_id) as(
    select A.player_id
    from Activity as A
    join first_login as f
    on f.player_id =A.player_id 
    where datediff(A.event_date,f.first_login)=1
)

select Round(count( distinct c.player_id)/count(distinct f.player_id),2) as fraction
from first_login as f
left join consecutive as c
on f.player_id=c.player_id;