FROM openjdk:8
add docker-demo-0.0.1-SNAPSHOT.jar docker-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-demo-0.0.1-SNAPSHOT.jar"]