CREATE DATABASE  IF NOT EXISTS `microservices_db`;
USE `microservices_db`;

drop table product;
drop table coupon;

create table product
(
	id int auto_increment,
	name varchar(20),
	description varchar(100),
	price decimal(8,3),
	PRIMARY KEY(id)
);

create table coupon
(
	id int auto_increment,
	code varchar(20),
	discount decimal(8,3),
	exp_date varchar(100),
	PRIMARY KEY(id)
);

select * from coupon;
select * from product;