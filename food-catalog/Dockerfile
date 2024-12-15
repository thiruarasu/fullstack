FROM openjdk:17-ea-10-jdk-alpine
WORKDIR /opt
ENV PORT=9012
EXPOSE 9012
COPY /target/*.jar /opt/food-catalog.jar
ENTRYPOINT ["java","-jar","food-catalog.jar"]
