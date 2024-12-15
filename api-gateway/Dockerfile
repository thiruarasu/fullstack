FROM openjdk:17-ea-10-jdk-alpine
WORKDIR /opt
ENV PORT 8765
EXPOSE 8765
COPY /target/*.jar /opt/api-gateway.jar
ENTRYPOINT ["java","-jar","api-gateway.jar"]