/*
 * Constraints
 * rules used to specify what data can be added to which columns
 * 
 * Primary Key
 * - a unique identifier for each individual record in the table
 * - under the hood -> PK = Unique and Not Null
 * 
 * What makes a good primary key?
 * 4 conditions: 
 * 		- Unique
 * 		- Not Null
 * 		- Non-sensitive
 * 		- Non-volatile = unchanging
 * 
 * Candidate Key (terminology) = something suitable for being used as a PK
 * 
 * Surrogate Key = when we create a column/field solely to be our PK (id)
 * 
 * --------------
 * Foreign Key
 * - used to establish a relationship with another table that has a primary key
 * 		- FK relates to PK directly 
 * - Referential Integrity = a principle that FKs in a table that refer to another table should ALWAYS
 * 								refer to a valid row/record in that other table
 * - should always point to a primary key in another table
 * 
 * Orphan Record : a record that references a (primary) key that no longer exists
 * 
 * Default
 * - specifies a default value for a column
 * 
 * Not null
 * - ensures that values in the column/field cannot be null (required)
 * 
 * Unique
 * - ensures that each value is unique
 * 
 * Check
 * - allows you to verify (check) that data being inserted into a column/field is within some range (across some value)
 * 
 * 
 * */


drop table if exists cats;
drop table if exists breeds;

-- Cats
create table cats (

	id serial primary key,
	name varchar(20) not null, 
	age integer, 
	breed integer -- FK to breeds table

);


-- Breeds -- Reference Table (Lookup Table) 
create table breeds (

	id serial primary key,
	breed varchar(30) 
);


alter table cats 
drop constraint cats_breed_fk;

-- Create a Foreign Key 
alter table cats 
add constraint cats_breed_fk
foreign key (breed) references breeds(id)
on delete set null;

delete from breeds where id = 5;

-- add some breeds to my breed table
insert into breeds values
(default, 'Calico'),
(default, 'Bengal'),
(default, 'Tabby'),
(default, 'Sphynx'),
(default, 'Siamese'),
(default, 'Panther');




-- add cats to our table
insert into cats values 
(default, 'North', 4, 1),
(default, 'Cusco', 2, 2),
(default, 'Garfield', 70, 3),
(default, 'Tigger', 10, 4),
(default, 'Felix', 100, 5),
(default, 'Tony', 3, 2),
(default, 'Imhotep', 8000, 4),
(default, 'Fred', 12, 6),
(default, 'Whiskers', 3, 4);


select * from breeds;
select * from cats;

/*
 * JOINS
 * are used to combine information across multiple tables
 * 		- combine tables horizontally based on some predicate 
 * 		- they extend the amount of information that you retrieve about each record
 * - Joins are not permanent changes to our DB
 * 
 * Left Join
 * Right Join
 * Inner Join
 * Full Join
 * and more
 * 
 * */

insert into breeds values (default, 'ninja');
insert into breeds values (default, 'marmalade');
insert into breeds values (default, 'blue');



select * from cats left join breeds on cats.breed = breeds.id; -- left outer join 

select * from cats right join breeds on cats.breed = breeds.id; --right outer join

select * from cats inner join breeds on cats.breed = breeds.id;

select * from cats full join breeds on cats.breed = breeds.id; -- full outer join


select c.id, c.name, c.age, b.breed as cat_breed from 
cats c left join breeds b 
on c.breed = b.id; 

select id, name, age as "Cat Age" from cats;

select * from breeds b ;


drop table breeds;




















