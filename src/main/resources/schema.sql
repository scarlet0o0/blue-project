create table post (
    id bigint generated by default as identity,
    content VARCHAR(255) NOT NULL,
    writer VARCHAR(255) NOT NULL,
    visibility_flag VARCHAR(20) NOT NULL,
    delete_flag CHAR(1) DEFAULT 'N' NOT NULL ,
    created_at TIMESTAMP NOT NULL,
    primary key (id)
);

create table book (
  id bigint generated by default as identity,
  title VARCHAR(255) NOT NULL,
  author VARCHAR(255) NOT NULL,
  publisher VARCHAR(255) NOT NULL,
  primary key (id)
);