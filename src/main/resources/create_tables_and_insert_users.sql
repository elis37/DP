create table files
(
    filename      varchar(255) not null,
    date          datetime(6)  not null,
    file_content  longblob     not null,
    size          bigint       not null,
    user_username varchar(255),
    primary key (filename)
);

create table users
(
    username varchar(255) not null,
    password varchar(255) not null,
    primary key (username)
);

create table users_user_files
(
    user_username       varchar(255) not null,
    user_files_filename varchar(255) not null
);

insert into users (username, password)
values ('user@one.user', '$2a$10$h7QmnlSEXLF2eQS4lIlRX.FXGZ0U8tpcLYi8IPkgLG/sqQiDA/HlG'); # pass: user_one

insert into users (username, password)
values ('user@two.user', '$2a$10$kNOJuKpknuUJPnOinunYDOEyJq2v3qXvyiaCMoS2CKOobT8Mfi8Da'); # pass: user_two