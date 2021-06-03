# Intro to RDBMS and PostgreSQL
A **database** is collection of related data.  A **DBMS** *(Data Base Management System)* is a collection of programs used to create and maintain a database.

DBMS is useful for:
* Storing data in a structured format.
* Allow concurrent use of data (many users).
* Control access to the data (admin privileges).
* Maintaining data integrity (maintain consistency and accuracy of data).
* Data backup and recovery.

#### Types of DBMS
The following DBMS's differ in the form by which they store and organize data.  We will focus primarily on **Relational Database Management Systems**, but it is importnant to know that other forms exist:

1. **Hierarchical Database Management Systems**: A hierarchical database is a design that uses a one-to-many relationship for data elements. Hierarchical database models use a tree structure that links a number of disparate elements to one "owner," or "parent," primary record.
2. **Network Database Management Systems**: Network database management systems (Network DBMSs) use a network structure to create relationship between entities. 
3. **Object-oriented Database Management Systems**: Object oriented DBMS support creation and modelling of data as objects. An object is a person, place, or thing. 
4. **Relational Database Management System**: A relational database refers to a database that stores data in a structured format consisting of tables, rows and columns.

## Relational Databases:
A Relational Database is a collection of data organized into *tables*.
<br>*Tables* contain:
* **Columns** of data categories.
* **Rows** with particular instances of that data category.

### RDBMS Vendors:
A relational database vendor is an entity that offers one or more databases to customers for license or sale.  Some are open-source and free. A few examples include:
* Oracle DB
* MySQL
* Microsoft SQL Server
* PostgreSQL
* Maria DB
* SQLite

## What is PostgreSQL (Postgres)?
[PostgreSQL](https://www.postgresql.org/), also known as Postgres, is a free and open-source relational database management system emphasizing extensibility and SQL compliance.
<br>
Besides supporting SQL, Postgres also supports **PL/pgSQL** (Procedural Language/PostgreSQL) which is a procedural programming language. It closely resembles Oracle's PL/SQL language.<br>
The design of PL/pgSQL aimed to allow PostgreSQL users to perform more complex operations and computations than SQL, while providing ease of use.

