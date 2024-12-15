FROM openjdk:17-ea-10-jdk-alpine
WORKDIR /opt
ENV PORT=8761
EXPOSE 8761
COPY /target/*.jar /opt/eureka-server.jar
ENTRYPOINT ["java","-jar","eureka-server.jar"]