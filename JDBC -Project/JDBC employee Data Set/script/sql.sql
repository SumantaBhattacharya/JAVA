CREATE DATABASE testDB;
USE testDB;

-- How to show a table? 
-- The ALTER TABLE statement is used to add, delete, or modify columns in an existing table.
CREATE TABLE EmpInfo (
    EMPLOYEE_ID int,
    FIRST_NAME varchar(69),
	LAST_NAME varchar(55),
    HIRE_DATA varchar(30)
);

desc EmpInfo;

INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(100, 'Steven', 'King', '17-JUN-87');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(101, 'Neena', 'Kochhar', '21-SEP-89');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(102, 'Lex', 'De Haan', '13-JAN-93');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(103, 'Alexander', 'Hunold', '03-jan-90');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(104, 'Bruce', 'Ernst', '21-May-91');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(107, 'Diana', 'Lorentz', '07-Feb-99');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(124, 'Kevin', 'Mourgos', '16-Nov-99');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(141, 'Trenna', 'Rajs', '17-Oct-95');
INSERT INTO EmpInfo(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATA) VALUES(142, 'Curtis', 'Davies', '29-jan-97');

-- create the table and insert data as given
-- find the length of the last names of the employees 
SELECT LAST_NAME, LENGTH(LAST_NAME) AS LAST_NAME_LENGTH FROM EmpInfo;
-- display the first name of all employees in lower case, those who work in department no 100 or 124 or 142
SELECT LOWER(FIRST_NAME) AS FIRST_NAME_LOWER
FROM EmpInfo
WHERE EMPLOYEE_ID IN (100, 124, 142);

-- find the no days elapsed between todays data and hire date round offf the no of days

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME,
       ROUND(DATEDIFF(CURDATE(), STR_TO_DATE(HIRE_DATA, '%d-%b-%y'))) AS DAYS_ELAPSED
FROM EmpInfo;



-- show databases;

SELECT * FROM EmpInfo;


