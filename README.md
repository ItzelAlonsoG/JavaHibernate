# JavaHibernate
# Content

- Introduction
- Excercise
- Install dependencies
- Run code
- Information

# Introduction 

**What are servlet?**
> Servlets are Java components or classes on the web server side that allow processing client requests and responding to them through the generation of dynamic content or redirecting them to other resources. The HttpServlet type Servlets are the most used since they work with the HTTP protocol (we can find it in the javax.servlet.http package) but, we can also use the GenericServlets if we need any other protocol (the package is javax.servlet).

**What is JSP?**
> JSPs (JavaServer Page) are server-side components that allow us to develop web pages with support for dynamic content thanks to the inclusion of Java code in html code using Tags (a special syntax that we can use at any time to add dynamic content :<p/> `<% for (1 = 0; i <10: i ++)%>)`<p/>
>The challenge of this class is to create a page with JSP to visualize the information of the users who register.

**What is Spring Framework?**
> Spring Framework is an Open Source framework created by Rod Jhonson in 2003, it was created due to the need to optimize our Java code and as an alternative to solve the complexity of other heavier technologies at that time (especially EJB). <p/>
> Spring Features: <p/>
> - It is NOT limited to the server side
> - Development based on POJOS
> - Low coupling - they are independent of each other
> - Declarative programming - xml context or annotations.
> - Reduction of boilerplate-boilerplate code
> - Layered architecture

**Spring boot**
> Spring Boot is a technology that allows optimizing development times in the creation and deployment of projects, allowing developers to focus on the development of the application.

**JDBC**
> JDBC is a standard for submitting requests to the database and obtaining information, a set of classes that manage the information in the database in a natural way (using DML and DDL statements).

**JPA**
> JPA is the standard Java proposal on how to convert Java objects into instructions for the database manager. This is why there are many tools that implement JPA to help us manage the persistence layer of our applications: ORMs.

**ORMs**
>ORMs allow us to work with relational databases using object-oriented programming. JPA is the standard Java proposal that ORMs must implement to interact with the database through objects. And all these ORMs use JDBC to read and write to the database. 

# Excercise

This repository contains a REST API that controls the operations of users in a reservation system. This API gets information from PostgreSQ

What this project does is:

- Deletes a user
- Updates a user
- Gets the users
- Gets a user by id
- Posts a new user
- authentication

# Install Dependencies

- [Spring Tool IDE](https://spring.io/tools)
- [JDK 8](https://www.oracle.com/mx/java/technologies/javase/javase-jdk8-downloads.html)
- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [OmniDB](https://omnidb.org/#downloads)

You can search this information in [Maven repository](https://mvnrepository.com/)
- Add spring-boot-starter-data-jpa
- Add lombok
- Add postgresql
- Add spring-boot-starter-web
- Add springfox-swagger2 2.7.0
- Add springfox-swagger-ui 2.7.0
- Add spring-boot-starter-thymeleaf

# Run code

1. Download this repository with:
 `$ git clone`

2. Open Spring tool suite and import the project like a `Existing maven project`.

<div>
  <img src="https://github.com/ItzelAlonsoG/JavaHibernate/blob/main/JavaHibertate1.PNG" width = "60%">
</div>

4. Using a new and empy workspace select the **e-reservation** folder.

<div>
  <img src="https://github.com/ItzelAlonsoG/JavaHibernate/blob/main/JavaHibertate2.PNG" width = "60%">

</div>
 
 5. To Run the project click on  the project name then right clic and select **Run As** and click  **Maven Build**.

<div>
<img src="https://github.com/ItzelAlonsoG/JavaHibernate/blob/main/JavaHibertate3.PNG" width = "60%">
</div>

# Information

for more you can check the [Java Hibernate course](https://platzi.com/clases/jee/ )
