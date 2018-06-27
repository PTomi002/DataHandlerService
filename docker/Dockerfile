FROM openjdk:8

WORKDIR /resources

ADD . /resources

# Expose only means that the container is willing to open the port, if a mapping requires it e.g.: in docker-compose.yml
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","DataHandlerServer.jar"]