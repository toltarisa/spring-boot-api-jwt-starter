### Spring Boot JWT Starter application
This application provides starter template code for further spring boot projects.
There is basic authentication with jwt in this project to quickly start a project.

#### How to run locally ?
First of all create a database in your local environment.This project provides PostgreSQL connection string.You can change it to any database inside application.properties.

Inside application.properties file under src/main/resources there is couple of empty values.You should fill those with correct information and provide a secret key.

After that, wait maven to install packages and than you can run static main method and start the application. 


#### Credits
This repository is clone of the article from Bezkoder's blog.[You can reach from here](https://bezkoder.com/spring-boot-jwt-authentication/)