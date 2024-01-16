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
