select contest_id, round(((count(contest_id)/(select count(*) from users))*100), 2) as percentage
from register
group by contest_id
order by percentage desc, contest_id asc;