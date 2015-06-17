
# --- !Ups

create table student (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email)
);

create table course (
  id                         bigint not null,
  professor_name             varchar(255),
  chair                      varchar(255),
  name						 varchar(255),
  description				varchar(255),
  rate						varchar(3),
  constraint pk_course primary key (id)
);

create table job (
  id                         bigint not null,
  company_name                varchar(255),
  title                      varchar(255),
  salary				     varchar(255),
  begin_time                 varchar(255),
  description				 varchar(255),
  constraint pk_job primary key (id)
);



# --- !Downs

drop table if exists student;
drop table if exists course;
drop table if exists job;


