insert into book (title, author, publisher) values ('소나기', '황순원', '민음사');
insert into book (title, author, publisher) values ('두 번째 산', '조정래', '창비');
insert into book (title, author, publisher) values ('삼국지', '이문열', '민음사');
insert into book (title, author, publisher) values ('백설공주', '남궁석', '아울북');
insert into book (title, author, publisher) values ('아몬드', '손원평', '문학동네');
insert into book (title, author, publisher) values ('부활', '레프 톨스토이', '민음사');
insert into book (title, author, publisher) values ('생각의 탄생', '샘 해리스', '김영사');
insert into book (title, author, publisher) values ('1Q84', '하루키 무라카미', '문학동네');
insert into book (title, author, publisher) values ('행복의 건축가들', '김수현', '더숲');
insert into book (title, author, publisher) values ('비밀의 정원', '한정훈', '창비');

INSERT INTO reading_status (status) VALUES ('좋아요');
INSERT INTO reading_status (status) VALUES ('볼만해요');
INSERT INTO reading_status (status) VALUES ('즐거워요');
INSERT INTO reading_status (status) VALUES ('신선해요');
INSERT INTO reading_status (status) VALUES ('우울해요');
INSERT INTO reading_status (status) VALUES ('모르겠어요');
INSERT INTO reading_status (status) VALUES ('이별을 당했어요');
INSERT INTO reading_status (status) VALUES ('매료돼요');
INSERT INTO reading_status (status) VALUES ('흥미로워요');
INSERT INTO reading_status (status) VALUES ('공부해야 해요');

INSERT INTO post (content, writer, visibility_flag, delete_flag, created_at, book_id, reading_status_id) VALUES
('오늘의 첫번째 글을 작성 해 보았다', '유저1', 'VISIBLE', 'N', NOW(), 1, 1),
('오늘의 두번째 글을 작성 해 보았다', '유저2', 'VISIBLE', 'N', NOW(), 2, 2),
('오늘의 세번째 글을 작성 해 보았다', '유저3', 'VISIBLE', 'N', NOW(), 3, 3),
('오늘의 네번째 글을 작성 해 보았다', '유저4', 'VISIBLE', 'N', NOW(), 4, 4),
('오늘의 다섯번째 글을 작성 해 보았다', '유저5', 'VISIBLE', 'N', NOW(), 5, 5),
('오늘의 여섯번째 글을 작성 해 보았다', '유저6', 'VISIBLE', 'N', NOW(), 6, 6),
('오늘의 일곱번째 글을 작성 해 보았다', '유저7', 'VISIBLE', 'N', NOW(), 7, 7),
('오늘의 여덟번째 글을 작성 해 보았다', '유저8', 'VISIBLE', 'N', NOW(), 8, 8),
('오늘의 아홉번째 글을 작성 해 보았다', '유저9', 'VISIBLE', 'N', NOW(), 9, 9),
('오늘의 열번째 글을 작성 해 보았다', '유저10', 'VISIBLE', 'N', NOW(), 10, 10),
('오늘의 열한번째 글을 작성 해 보았다', '유저11', 'VISIBLE', 'N', NOW(), 1, 1),
('오늘의 열두번째 글을 작성 해 보았다', '유저12', 'VISIBLE', 'N', NOW(), 2, 2),
('오늘의 열세번째 글을 작성 해 보았다', '유저13', 'VISIBLE', 'N', NOW(), 3, 3),
('오늘의 열네번째 글을 작성 해 보았다', '유저14', 'VISIBLE', 'N', NOW(), 4, 4),
('오늘의 열다섯번째 글을 작성 해 보았다', '유저15', 'VISIBLE', 'N', NOW(), 5, 5),
('오늘의 열여섯번째 글을 작성 해 보았다', '유저16', 'VISIBLE', 'N', NOW(), 6, 6),
('오늘의 열일곱번째 글을 작성 해 보았다', '유저17', 'VISIBLE', 'N', NOW(), 7, 7),
('오늘의 열여덟번째 글을 작성 해 보았다', '유저18', 'VISIBLE', 'N', NOW(),8, 8),
('오늘의 열아홉번째 글을 작성 해 보았다', '유저19', 'VISIBLE', 'N', NOW(), 9, 9),
('오늘의 스무번째 글을 작성 해 보았다', '유저20', 'VISIBLE', 'N', NOW(), 10, 10),
('오늘의 이십한번째 글을 작성 해 보았다', '유저21', 'VISIBLE', 'N', NOW(), 1, 1),
('오늘의 이십두번째 글을 작성 해 보았다', '유저22', 'VISIBLE', 'N', NOW(), 2, 2),
('오늘의 이십세번째 글을 작성 해 보았다', '유저23', 'VISIBLE', 'N', NOW(), 3, 3),
('오늘의 이십네번째 글을 작성 해 보았다', '유저24', 'VISIBLE', 'N', NOW(), 4, 4),
('오늘의 이십다섯번째 글을 작성 해 보았다', '유저25', 'VISIBLE', 'N', NOW(), 5, 5),
('오늘의 이십여섯번째 글을 작성 해 보았다', '유저26', 'VISIBLE', 'N', NOW(), 6, 6),
('오늘의 이십일곱번째 글을 작성 해 보았다', '유저27', 'VISIBLE', 'N', NOW(), 7, 7),
('오늘의 이십여덟번째 글을 작성 해 보았다', '유저28', 'VISIBLE', 'N', NOW(), 8, 8),
('오늘의 이십아홉번째 글을 작성 해 보았다', '유저29', 'VISIBLE', 'N', NOW(), 9, 9),
('오늘의 삼십번째 글을 작성 해 보았다', '유저30', 'VISIBLE', 'N', NOW(), 10, 10);
