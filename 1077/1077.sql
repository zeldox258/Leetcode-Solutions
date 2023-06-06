
SELECT project_id, employee_id
FROM (
    SELECT p.project_id, p.employee_id, e.experience_years,
           RANK() OVER (PARTITION BY p.project_id ORDER BY e.experience_years DESC) AS rk
    FROM Project p JOIN Employee e ON p.employee_id=e.employee_id
) ranked WHERE rk=1
