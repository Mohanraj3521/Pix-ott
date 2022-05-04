#Pix-ott Platform

## Description

Pix is an imaginary “Over The Top” (ott) platform. It is an app built as a console-based application using Java, JDBC and MySQL database. It has the layout consists of Login, Sign up and Exit options.
For login, user input will be collected from console and JDBC connection will be established to fetch the user details and allows user to login.
If user details are valid, layout options will consist of Top 5 Movies, Show History and WishList. Each options entered will establish JDBC connection and displays the fetched details from DAO.
For signup, user's mobile number, user name and password will be collected and store in a USER table.
If exit option is chosen, it would stop the application.

## Technologies Used

* Java 1.8
* MySQL
* JDBC

## Softwares Used

* Eclipse for Java EE Developers/SpringToolSuite 4
* MySQL Workbench 8.0
* MySQL Editor 8.0

## Features

* User can create an account using Pix-ott platoform using their mobile no, user name and password.
* User can login that account.
* User can view the TOP 5 Movies currently trending movies.
* User can search movies based on keywords. 

To-do list:
* User input field validation to be taken place when login/sign up.
* To add unavailable movies to the movie list.
* To delete movie history and movie wishlist.
* To add a movie to Wish List.
* To play a movie from top 5, to watch a movie.
* Admin I want remove and make another movie for top 5.
* Admin I want to update movies details. 

## Getting Started

  Download source code from https://github.com/Mohanraj3521/Pix-ott
  - Import the project in Eclipse/Springtoolsuite IDE.
  - Add a driver manager in library.
  - Create an user table, movie table, topfivemovie table mentioned in DAO files in pixott schema.
  - Point the url to localhost in app.properties and provide DB credentials.

## Usage

> After setting up property file and driver manager dependencies, right click source folder -> Run as Java applications.


## License

All the technologies used in this project is open source.
