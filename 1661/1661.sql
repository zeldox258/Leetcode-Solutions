select a.machine_id, round(sum(case when a.activity_type='start' then a.timestamp*-1 else a.timestamp end)/count(distinct a.process_id), 3) processing_time 
from activity a 
group by 1;