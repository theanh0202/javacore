DROP DATABASE IF EXISTS jdbc;
create database jdbc;
use jdbc;
drop table if exists Account;
create table Account (
                         account_id			int auto_increment primary key,
                         full_name			varchar(50),
                         email				varchar(50) not null,
                         password			varchar(50) not null
);
drop table if exists Department;
create table Department (
                         department_id			int auto_increment primary key,
                         department			varchar(50) not null unique

);
DROP PROCEDURE IF EXISTS checkDepartmentName;

DELIMITER $$
CREATE PROCEDURE checkDepartmentName (IN va_department_name nvarchar(20))
BEGIN
    SELECT * FROM jdbc.Department WHERE department_name = va_department_name;
END$$
DELIMITER ;

CALL checkDepartmentName('Java');


