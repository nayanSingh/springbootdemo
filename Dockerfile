FROM openjdk:19-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY target/FeignClientDemo-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]