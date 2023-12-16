SELECT e.employee_id
FROM employees e
WHERE e.salary < 30000 AND e.manager_id not IN(
    select employee_id FROM employees
)
ORDER BY employee_id 