-- this is how we write comments in SQL
/*
 * This will create multi-
 * line comments
 * 
 * */

drop table movies;

-- Create a table (DDL)
CREATE TABLE movies (
	id serial,
	title varchar(50),
	genre varchar(30),
	release_year int
);

select * from movies;
-- DROP table (DDL) 
drop table movies;

drop table if exists movies;



-- TRUNCATE (DDL) -- DROPS table and then Creates table (basically - deleting all data from the table)
truncate movies;

-- ALTER (DDL)
alter table movies alter column release_year type numeric(4, 0);

alter table movies add column domestic_gross money;

-- serial is a sequence
select nextval('movies_id_seq'); 

select currval('movies_id_seq'); 
-- edit the table



-- Create - of our CRUD operations (DML)
insert into movies values (default, 'Thor', 'Action', 2000); -- sortof like Movie thor = new Movie("Thor", "Action", 2000);
insert into movies values (default, 'Ant-Man', 'Adventure', 2008);
insert into movies values (default, 'Jumanji', 'Adventure', 1997);

insert into movies values 
(default, 'Jumanji', 'Adventure', 1997), 
(default, 'Jumanji', 'Adventure', 1997), 
(default, 'Jumanji', 'Adventure', 1997);


-- Read - 
select * from movies; -- this will select all of the records in the movies table

select title, genre from movies;

-- Update 
update movies set genre = 'Changed Genre' where id = 5;
update movies set genre = 'Horror' where id in (1, 3, 5);
update movies set genre = 'Another Genre' where id < 6 and id >2;
update movies set genre = 'Horror' where id between 2 and 3;

-- Delete
delete from movies where id = 6;
delete from movies;

commit;
rollback;

-- If you want on your own: 
/*
 * 
 * Create another table
 * practice adding records to a table
 * 
 * practice retrieving records from a table (SELECT)
 * 
 * 
 * practice update
 * 
 * 
 * practice deleting
 * 
 * 
 * */


