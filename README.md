After running the application to connect to H2Data base follow the below steps:|

1) Open the URL : http://localhost:8080/h2-console
2) Replac the jdbc url with - jdbc:h2:mem:user_data (which is mentioned in application the properties);
3) Connect
4) Hit the save API with a sample object like this using postman.

http://localhost:8080/save - POST

body : 

{
    "id": "1",
    "name": "Abhijit K",
    "email": "abhijit.k@abc.com",
    "phoneNo": "7970963271"
}

