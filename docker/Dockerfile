FROM openjdk:8-jdk-alpine
MAINTAINER njrtriplicity@gmail.com

RUN mkdir -p /opt/app
ADD target/*.jar /opt/app/app.jar

# Add entrypoint.sh at the root of the container
COPY ./docker/entrypoint.sh /entrypoint.sh

# Make sure entrypoint.sh is executable
RUN chmod +x /entrypoint.sh

EXPOSE 5002

#Non Root User Configuration
RUN addgroup -S -g 10001 appGrp \
    && adduser -S -D -u 10000 -s /sbin/nologin -h /opt/app/ -G appGrp app\
    && chown -R 10000:10001 /opt/app

USER 10000

WORKDIR /opt/app
ENTRYPOINT ["sh","/entrypoint.sh"]