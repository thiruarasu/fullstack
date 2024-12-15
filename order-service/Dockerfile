FROM openjdk:17-ea-10-jdk-alpine
WORKDIR /opt
ENV PORT=9013
EXPOSE 9013
COPY /target/*.jar /opt/order-service.jar
ENTRYPOINT ["java","-jar","order-service.jar"]
