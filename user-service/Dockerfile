FROM openjdk:17-ea-10-jdk-alpine
WORKDIR /opt
ENV PORT=9010
EXPOSE 9010
COPY /target/*.jar /opt/user-service.jar
ENTRYPOINT ["java","-jar","user-service.jar"]

