# spring-multi-datasource
Java Spring App with 1 table Entity that Exists in 2 separate databases

to run locally you need to docker instances:

docker run -P --name=pg1 -d --env POSTGRES_HOST_AUTH_METHOD=trust postgres:latest

docker run -P --name=pg2 -d --env POSTGRES_HOST_AUTH_METHOD=trust postgres:latest

You will need to change the application-properties to match the ports in the databse url property.
