INSERT into theatre(id ,modificationCounter ,name ) VALUES(1,1,'PVR');
INSERT into theatre(id ,modificationCounter ,name ) VALUES(2,1,'INOX');


Insert into auditorium(id ,modificationCounter ,seat_count ,theatre_id) VALUES(1,1,20,1);
Insert into auditorium(id ,modificationCounter ,seat_count ,theatre_id) VALUES(2,1,25,1);
Insert into auditorium(id ,modificationCounter ,seat_count ,theatre_id) VALUES(3,1,30,2);
Insert into auditorium(id ,modificationCounter ,seat_count ,theatre_id) VALUES(4,1,20,2);

Insert into movie(id ,modificationCounter ,duration ,genre ,poster ,title) VALUES(1,1,170,'Thriller',NULL,'The Batman');
Insert into movie(id ,modificationCounter ,duration ,genre ,poster ,title) VALUES(2,1,130,'Action',NULL,'The Ring');
Insert into movie(id ,modificationCounter ,duration ,genre ,poster ,title) VALUES(3,1,140,'Action',NULL,'Avengers');

Insert into screening(id ,modificationCounter ,date ,end_time ,start_time ,auditorium_id ,movie_id ,is_full) VALUES (1,1,'2022-05-16','12:00:00','10:00:00',2,2, false);
Insert into screening(id ,modificationCounter ,date ,end_time ,start_time ,auditorium_id ,movie_id ,is_full) VALUES (2,1,'2022-06-16','12:00:00','09:00:00',1,1, false);
Insert into screening(id ,modificationCounter ,date ,end_time ,start_time ,auditorium_id ,movie_id ,is_full) VALUES (3,1,'2022-05-16','14:00:00','12:00:00',2,3, false);

INSERT into seat(id ,modificationCounter ,seat_number ,auditorium_id) VALUES(1,1,1,1);
INSERT into seat(id ,modificationCounter ,seat_number ,auditorium_id) VALUES(2,1,2,1);
INSERT into seat(id ,modificationCounter ,seat_number ,auditorium_id) VALUES(3,1,3,1);
INSERT into seat(id ,modificationCounter ,seat_number ,auditorium_id) VALUES(4,1,1,2);
INSERT into seat(id ,modificationCounter ,seat_number ,auditorium_id) VALUES(5,1,6,3);

INSERT into user(id ,modificationCounter ,password ,user_name) VALUES(1,1,'pass','nilim');
INSERT into user(id ,modificationCounter ,password ,user_name) VALUES(2,1,'drop','nil');

INSERT into booking(id ,modificationcounter ,booking_time ,is_active ,is_booked ,screening_id ,user_id) VALUES (1,1,'08:00:00',true,true,2,1);
INSERT into booking(id ,modificationcounter ,booking_time ,is_active ,is_booked ,screening_id ,user_id) VALUES (2,1,'08:00:00',true,true,3,1);