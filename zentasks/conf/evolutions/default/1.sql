
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
  name			     varchar(255),
  description		     varchar(255),
  rate			     varchar(3),
  constraint pk_course primary key (id)
);

create table job (
  id                         bigint not null,
  company_name               varchar(255),
  title                      varchar(255),
  salary		     varchar(255),
  begin_time                 varchar(255),
  description		     varchar(255),
  constraint pk_job primary key (id)
);

create table company (
  id                         bigint not null,
  name                       varchar(255),
  desc                       varchar(255),
  constraint pk_company primary key (id)
);

create table uploads (
  id                         bigint not null,
  name                       varchar(255),
  data                       varchar(255),
  constraint pk_uploads primary key (id)
);

create table comment (
  id                         bigint not null,
  text                       varchar(255),
  autor                      varchar(255),
  constraint pk_comment primary key (id)
);

create table ranking (
  id                         bigint not null,
  text                       varchar(255),
  autor                      varchar(255),
  constraint pk_ranking primary key (id)
);


# --- !Downs

drop table if exists student;
drop table if exists course;
drop table if exists job;
drop table if exists company;
drop table if exists uploads;
drop table if exists comment;
drop table if exists ranking;
