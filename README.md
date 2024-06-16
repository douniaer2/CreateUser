A Spring Boot application that provides a RESTful API in order to manage the creation of users

FEATURES:
Create a new user

Technologies Used:
Spring Boot
Spring Data MongoDB
Apache Kafka
Maven
Postman (for API testing)

Set up MongoDB:

Ensure MongoDB is installed and running on your local machine. Create a database named UserDb and a collection named "users"

Configure application properties:

make sure that the application.properties file has MongoDB connection string:
spring.data.mongodb.uri=mongodb://localhost:27017/UserDb

send a POST request to http://localhost:8080/api/users with the following JSON body:

{
    "name": "Dounia",
    "surname": "El Rhani",
    "email": "douniaelrh@gmail.com",
    "password": "123456"
}
