select name from Employee where id in
(select e.managerId from Employee e  group by e.managerId having count(*) >= 5)

