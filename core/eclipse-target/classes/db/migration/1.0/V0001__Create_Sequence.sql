-- Leave a large ID space reserved for master-data and test-data
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1000000;

CREATE TABLE theatre (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  name VARCHAR(255) DEFAULT NULL,
  CONSTRAINT PK_theatre PRIMARY KEY(id)
);

CREATE TABLE user (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  password VARCHAR(255) DEFAULT NULL,
  user_name VARCHAR(255) DEFAULT NULL,
  CONSTRAINT PK_user PRIMARY KEY(id)
);

CREATE TABLE movie (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  duration INTEGER DEFAULT NULL,
  genre VARCHAR(255) DEFAULT NULL,
  poster VARCHAR(255) DEFAULT NULL,
  title VARCHAR(255) DEFAULT NULL,
  CONSTRAINT PK_movie PRIMARY KEY(id)
);

CREATE TABLE auditorium (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  seat_count INTEGER DEFAULT NULL,
  theatre_id BIGINT NOT NULL,
  CONSTRAINT PK_auditorium PRIMARY KEY(id),
  CONSTRAINT FK_auditorium_theatre_id FOREIGN KEY(theatre_id) REFERENCES theatre(id) NOCHECK
);

CREATE TABLE screening (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  date DATE DEFAULT NULL,
  end_time TIME DEFAULT NULL,
  start_time TIME DEFAULT NULL,
  auditorium_id BIGINT NOT NULL,
  movie_id BIGINT NOT NULL,
  is_full BOOLEAN,
  price DOUBLE DEFAULT NULL,
  CONSTRAINT PK_screening PRIMARY KEY(id),
  CONSTRAINT FK_screening_auditorium_id FOREIGN KEY(auditorium_id) REFERENCES auditorium(id) NOCHECK,
  CONSTRAINT FK_screening_movie_id FOREIGN KEY(movie_id) REFERENCES movie(id) NOCHECK
);

CREATE TABLE booking (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  booking_time TIME DEFAULT NULL,
  is_active BOOLEAN DEFAULT NULL,
  is_booked BOOLEAN DEFAULT NULL,
  screening_id BIGINT NOT NULL,
  user_id BIGINT NOT NULL,
  CONSTRAINT PK_booking PRIMARY KEY(id),
  CONSTRAINT FK_booking_screening_id FOREIGN KEY(screening_id) REFERENCES screening(id) NOCHECK,
  CONSTRAINT FK_booking_user_id FOREIGN KEY(user_id) REFERENCES user(id) NOCHECK
);


CREATE TABLE seat (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  seat_number INTEGER DEFAULT NULL,
  auditorium_id BIGINT NOT NULL,
  CONSTRAINT PK_seat PRIMARY KEY(id),
  CONSTRAINT FK_seat_auditorium_id FOREIGN KEY(auditorium_id) REFERENCES auditorium(id) NOCHECK
);

CREATE TABLE seat_booked (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  booking_id BIGINT NOT NULL,
  screening_id BIGINT NOT NULL,
  seat_id BIGINT NOT NULL,
  CONSTRAINT PK_seat_booked PRIMARY KEY(id),
  CONSTRAINT FK_seat_booked_booking_id FOREIGN KEY(booking_id) REFERENCES booking(id) NOCHECK,
  CONSTRAINT FK_seat_booked_screening_id FOREIGN KEY(screening_id) REFERENCES screening(id) NOCHECK,
  CONSTRAINT FK_seat_booked_seat_id FOREIGN KEY(seat_id) REFERENCES seat(id) NOCHECK
);














