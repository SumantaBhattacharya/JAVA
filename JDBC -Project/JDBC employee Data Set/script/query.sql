CREATE TABLE emp (
    id INT,
    name VARCHAR(10),
    salary DECIMAL(10, 2)
);
desc emp


ALTER table emp add address varchar(86);
ALTER table emp drop column address
ALTER table emp modify id varchar(10) 
ALTER table emp rename column id to rollNo
alter table emp rename to employee;

desc employee;

alter table employee add primary key(rollNo)

drop database emp;

