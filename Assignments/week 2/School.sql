-- Drop original tables

DROP TABLE IF EXISTS course_topic CASCADE;

DROP TABLE IF EXISTS student_course CASCADE;

DROP TABLE IF EXISTS courses CASCADE;

DROP TABLE IF EXISTS teachers CASCADE;

DROP TABLE IF EXISTS topics CASCADE;

DROP TABLE IF EXISTS students CASCADE;

-- Create Student Table

CREATE TABLE students(
	student_id serial PRIMARY KEY,
	"first" varchar(25),
	"last" varchar(25),
	phone int8,
	email varchar(50) NOT NULL UNIQUE
);

-- Create Topic Table

CREATE TABLE topics(
	topic_id serial PRIMARY KEY,
	description varchar(255)
);

-- Create Teacher Table

CREATE TABLE teachers(
	teacher_id serial PRIMARY KEY,
	"first" varchar(25),
	"last" varchar(25)
);

-- Create Courses Table

CREATE TABLE courses(
	course_id serial PRIMARY KEY,
	title varchar(25),
	course_num varchar(10),
	teacher_id int REFERENCES teachers UNIQUE 
);

-- Create Student Course Junction Table

CREATE TABLE student_course (
	student_id int REFERENCES students,
	course_id int REFERENCES courses
);

-- Create Course Topic Junction Table

CREATE TABLE course_topic(
	course_id int REFERENCES courses,
	topic_id int REFERENCES topics
);

-- Insert Data

insert into students (first, last, phone, email) values ('Guglielma', 'Quelch', 5678950306, 'gquelch0@cam.ac.uk');
insert into students (first, last, phone, email) values ('Thedric', 'McCaughren', 3388378749, 'tmccaughren1@tiny.cc');
insert into students (first, last, phone, email) values ('Vin', 'Laidel', 4475199133, 'vlaidel2@list-manage.com');
insert into students (first, last, phone, email) values ('Ainslie', 'Strickett', 4921520771, 'astrickett3@weebly.com');
insert into students (first, last, phone, email) values ('Susan', 'Ploughwright', 1347185553, 'sploughwright4@goo.gl');
insert into students (first, last, phone, email) values ('Oliver', 'Doig', 6722260981, 'odoig5@so-net.ne.jp');
insert into students (first, last, phone, email) values ('Rica', 'Matfin', 9159425541, 'rmatfin6@alibaba.com');
insert into students (first, last, phone, email) values ('Cristie', 'Dowdell', 5673301157, 'cdowdell7@soup.io');
insert into students (first, last, phone, email) values ('Robbi', 'Buckleigh', 9519518195, 'rbuckleigh8@xrea.com');
insert into students (first, last, phone, email) values ('Jacklyn', 'Jarvie', 3827045815, 'jjarvie9@wp.com');

INSERT INTO topics (description) 
VALUES 
	('Basics of Addition'), 
	('Basics of Science'), 
	('Basics of Reading'), 
	('Advanced Reading'), 
	('Intermediate Math'), 
	('Advanced Math'), 
	('Basics of Programming'), 
	('Intro to SQL'), 
	('Intro to Java');

insert into teachers (first, last) values ('Constancy', 'Mosedill');
insert into teachers (first, last) values ('Auria', 'Sumpter');
insert into teachers (first, last) values ('Rafaela', 'Poller');
insert into teachers (first, last) values ('Hillary', 'Cobbled');
insert into teachers (first, last) values ('Kendrick', 'Tidbold');
	

INSERT INTO courses (title, course_num, teacher_id)
VALUES 
	('Math introduction', 'MATH101', 1),
	('Reading introduction', 'READ101', 2),
	('Programming introduction', 'PROG101', 3),
	('Java introduction', 'JAVA101', 4);

insert into student_course (student_id, course_id) values (4, 1);
insert into student_course (student_id, course_id) values (8, 3);
insert into student_course (student_id, course_id) values (1, 1);
insert into student_course (student_id, course_id) values (3, 4);
insert into student_course (student_id, course_id) values (8, 1);


insert into course_topic (course_id, topic_id) values (2, 7);
insert into course_topic (course_id, topic_id) values (2, 9);
insert into course_topic (course_id, topic_id) values (2, 8);
insert into course_topic (course_id, topic_id) values (3, 5);
insert into course_topic (course_id, topic_id) values (2, 5);
insert into course_topic (course_id, topic_id) values (3, 4);
insert into course_topic (course_id, topic_id) values (3, 3);
insert into course_topic (course_id, topic_id) values (1, 5);
insert into course_topic (course_id, topic_id) values (3, 9);
insert into course_topic (course_id, topic_id) values (1, 5);