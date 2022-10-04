# spring_hibernate_derby_todos_application
A web application that uses Spring Boot, Spring MVC, Spring JPA, Hibernate and Apache Derby database to allow users to store, manipulate and retrieve Todos of users.


Table to be created:

create table users
(username varchar(10) primary key,
 password varchar(10) not null,
 email  varchar(50) unique
 );
 
 create table todos
 (
	id  integer primary key auto_increment,
    text varchar(200),
    category varchar(10),
    username varchar(10),
    foreign key(username) references users(username)
)


#### This application demostrates how to use the following:

* MySQL database 
* Spring Boot
* Spring MVC
* Spring JPA using Hibernate
* Hiberate using Apache Derby Database
* JSPs for views
* JSTL core tags and functions
* Maven build tool 
* Filter to redirect anonymous users to login page
* Session to keep track of current user

