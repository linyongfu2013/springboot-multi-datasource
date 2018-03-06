# noinspection SqlNoDataSourceInspectionForFile

create table t_user
(
	user_id bigint auto_increment
		primary key,
	user_name varchar(32) null,
	gender tinyint default '1' null,
	phone bigint null,
	email varchar(64) null,
	create_time datetime default CURRENT_TIMESTAMP null,
	update_time timestamp default CURRENT_TIMESTAMP not null,
	constraint t_user_phone_uindex
		unique (phone)
);

