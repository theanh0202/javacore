DROP DATABASE IF EXISTS assignment10;
create database assignment10;
use assignment10;

drop table if exists Department;
create table `Department` (
                              department_id			int auto_increment primary key,
                              department_name			varchar(50) not null unique
);

create table `User`
(
    id            int primary key auto_increment,
    `role`          enum ('ADMIN', 'USER') not null,
    username     nvarchar(20)           not null unique,
    `password`      nvarchar(20)         not null,
    email         varchar(30)            not null unique,
    date_of_birth date,
    department_id int,
    foreign key (department_id) REFERENCES Department(department_id)
);

INSERT INTO `assignment10`.`Department` (`department_name`) VALUES ('java');
INSERT INTO `assignment10`.`Department` (`department_name`) VALUES ('php');
INSERT INTO `assignment10`.`Department` (`department_name`) VALUES ('scrum master');

INSERT INTO `assignment10`.`User` (`role`, `username`, `password`, `email`, `date_of_birth`, department_id)
VALUES ('ADMIN', 'ADMIN', '123456', 'admin@gmail.com', '2000-03-22', 1);
INSERT INTO `assignment10`.`User` (`role`, `username`, `password`, `email`, `date_of_birth`, department_id)
VALUES ('USER', 'USER', '123456', 'user@gmail.com', '2001-03-22', 3);

DELIMITER //

CREATE PROCEDURE get_user_by_id(IN user_id_param INT)
BEGIN
    SELECT *
    FROM `User`
    WHERE id = user_id_param;
END;
//

DELIMITER ;





DROP DATABASE IF EXISTS final_ra66;
create database final_ra66;
use final_ra66;
DROP TABLE IF EXISTS `User`;

create table `User`
(
    `id`       int auto_increment primary key,
    full_name  varchar(50),
    email      varchar(50) not null,
    password   varchar(50) not null,
    exp        int,
    pro_skill  varchar(50),
    project_id int,
    role       enum ('employee','manager')
    );
INSERT INTO final_ra66.user (id, full_name, email, password, exp, pro_skill, project_id, role) VALUES (1, 'nguyen van a', 'a@gmail.com', '12345678', 2, null, 1, 'employee');
INSERT INTO final_ra66.user (id, full_name, email, password, exp, pro_skill, project_id, role) VALUES (2, 'nguyen van b ', 'b@gmail.com', '12345678', 3, null, 2, 'manager');
INSERT INTO final_ra66.user (id, full_name, email, password, exp, pro_skill, project_id, role) VALUES (3, 'nguyen van c', 'c@gmail.com', '12345678', 1, null, 1, 'manager');