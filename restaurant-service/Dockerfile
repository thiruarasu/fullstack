FROM openjdk:17-ea-10-jdk-alpine
WORKDIR /opt
ENV PORT=9011
EXPOSE 9011
COPY /target/*.jar /opt/restaurant-service.jar
ENTRYPOINT ["java","-jar","restaurant-service.jar"]
