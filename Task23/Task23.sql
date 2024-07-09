create table Employee (empno int not null,ename varchar(15),job varchar(15), mgr int not null,
hiredate int not null,salary int not null, comm int,deptno int not null);

alter table Employee modify hiredate date not null;

insert into Employee (empno ,ename ,job , mgr ,hiredate ,salary , comm ,deptno) 
values(8839,'AMIR','President',null,'1991-11-01',5000.00,null,30);


Select * from Employee where SUBSTRING(ename, 2, 1) = 'A';


Select * from Employee where ename like ‘%T’ 

Select * from Employee where salary>=2000; 

Select * from Employee where salary not between 2000 and 4000; 

Select * from Employee where mgr is null; 

Select * from Employee where comm is null; 

alter table Employee modify mgr int;
set SQL_SAFE_UPDATES = 0;
delete from Employee where ename = 'AMIR';



