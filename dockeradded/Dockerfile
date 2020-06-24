FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} jenkin-docker.jar
ENTRYPOINT ["java","-jar","/jenkin-docker.jar"]