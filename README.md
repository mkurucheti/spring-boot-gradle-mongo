## This is a sample Spring Boot gradle and MongoDB integration demo project


# Pre requesites - Make sure you have installed following
## Java 1.8 or above
## Gradle (optional)
## mongoDB
## Robomongo (optional) - Tool to access mongo database 

### Start your mongoDb 
Go to mongo bin folder and run mongod.exe command
This will start the mongo on localhost 27017 port.

DB Name: studentmgmt
Clone or download the project 

Go to the project home folder and run below command



### gradlew bootRun

#### This will run the spring boot application on localhost

URL to access the application:

** http://localhost:8080/student

# Student service API
## Add Student:

URL: http://localhost:8080/student
Method: POST
Body:
{
	"id" : "1",
	"name": "name1",
	"course": "c1",
	"year": "1"
}

## Update Student:

URL: http://localhost:8080/student
Method: PUT
Body:
{
	"id" : "1",
	"name": "name1",
	"course": "c1",
	"year": "1"
}

## Get Student:

URL: http://localhost:8080/student/{id}
Method: Get
Body: -

## Delete Student:

URL: http://localhost:8080/student/{id}
Method: Delete
Body: -




