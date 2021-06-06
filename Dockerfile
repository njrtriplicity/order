FROM openjdk:8-jdk-alpine
MAINTAINER njrtriplicity@gmail.com

ADD target/*.jar app.jar


EXPOSE 52026

ENTRYPOINT ["java","-jar","/app.jar"]