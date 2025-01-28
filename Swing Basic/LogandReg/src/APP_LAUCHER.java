import javax.swing.SwingUtilities;

//import gui.RegisterFormGui;
import gui.loginformgui;

public class APP_LAUCHER {
    public static void main(String[] args) throws Exception {
        // we will use invokelater() to make updates to GUI more threadsafe and
        // efficient
        SwingUtilities.invokeLater(new Runnable() {// SwingUtilities is a class

            @Override
            public void run() {
                // creating instance of loginformgui
                new loginformgui(null).setVisible(true);
                // new RegisterFormGui(null).setVisible(true);
            }

        });
    }
}/*
  * The Java.Java Archive tool of JDK used to package.one or more Java class
  * files and associated metadata and resource that is.confined of text images,
  * etc, into one file to distribute application software or libraries on the
  * Java platform. And it provides the facility to create the exchange.of Jar
  * file, which calls the beam method of the class if you want.to double check
  * it. Simply speaking, this is a format for achieving data. This is
  * similar.This is similar to you using Winrar or Winzip.
  */
/*
 * PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java> java
 * -version
 * java version "20.0.2" 2023-07-18
 * Java(TM) SE Runtime Environment (build 20.0.2+9-78)
 * Java HotSpot(TM) 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)
 */
/*
 * Java JDBC tutorials
 * JDBC stands for Java database connectivity.
 * JDBC is a Java api to connect and execute the query with the database.It is a
 * part of
 * Java sE stands for Java standard edition. Jdbc api uses jdbc drivers to
 * connect with the database.
 * There are four types of jdbc drivers.
 * JDBC-ODBC Bridge Driver,
 * Native Driver,
 * Network Protocol Driver, and
 * Thin Driver
 * (JDBC API)---[JAVA Application]--->JDBC Driver--->(Database)
 * There are two types of database.
 * One is the kind of relational database.
 * 1.Relational database management system(RDMS):-Use of Sql Programming
 * language,Structure: Organized data in tables(Tabular format) with rows and columns.
 * 2.NoSQL Database
 * 
 * We can use JDBC API to access tabular data stored in any relational database.
 * By the help of JDBC API, we can save, update, delete and fetch data from the
 * database. It is like Open Database Connectivity (ODBC) provided by Microsoft.
 */
/*
 * https://www.mysql.com/
 * https://www.mysql.com/downloads/
 * https://dev.mysql.com/downloads/
 * https://dev.mysql.com/downloads/installer/
 * https://dev.mysql.com/downloads/file/?id=523568
 * https://youtu.be/k5tICunelSU?si=h-J2X1Ibb2jLQuDg
 * C:\Program Files\MySQL\MySQL Server 8.0\bin
 * C:\Users\Sumanta Bhattacharya>mysql --version
 * mysql  Ver 8.0.35 for Win64 on x86_64 (MySQL Community Server - GPL)
 * mysql -u root -p
 * -u=root
 * -p=password
 * C:\Users\Sumanta Bhattacharya>mysql -u root -p
Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 8.0.35 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

  * show database;
  mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.01 sec)
  
create database sumantadb;
mysql> create database sumantadb;
Query OK, 1 row affected (0.01 sec)

show databases;
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sumantadb          |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

SQL stand for structured query language.Sql is not a case sensitive language Which means you can either prefer small otherwise capital form?of alphabet?
Here we don't execute the whole statements as a whole. We execute the statement each by.each so we can see the output of each statement and not as a whole.

-- CRUDC (C=create,R=read ,U=update and D=delete.)

CREATE DATABASE db1;
SHOW DATABASES;
USE db1;
DROP DATABASE db1;
CREATE TABLE StudentInfo (
    rollNo int,
    Name varchar(69),
    Degree varchar(55),
    age int
);
select * from StudentInfo;
ALTER TABLE StudentInfo ADD address varchar(68);
ADD address varchar(68);
DESC StudentInfo;
ALTER table StudentInfo modify Degree varchar(86);
ALTER TABLE StudentInfo CHANGE column rollNo stID int ;
ALTER TABLE StudentInfo CHANGE column rollNo stID int ;
Alter table StudentInfo rename to StudentsInfo;
Show tables;
ALTER TABLE StudentInfo drop column age;
INSERT INTO StudentsInfo(stID, Name, Degree, address) VALUES(180, 'SUMANTA', 'BCA', 'Assam - 782480');
select Name,rollNo,Degree,age from StudentInfo; or select * from StudentInfo;
DROP TABLE IF EXISTS StudentsInfo;
*/