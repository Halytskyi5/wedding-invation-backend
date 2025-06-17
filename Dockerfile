FROM maven:3.9.9-eclipse-temurin-17-alpine as builder

COPY ./src src/
COPY ./pom.xml pom.xml

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
COPY --from=builder target/*jar app.jar

EXPOSE 8080

CMD ["java","-jar","app.jar"]
#FROM maven:3.8.4-openjdk-17 AS build
#
#WORKDIR /app
#
#COPY pom.xml .
#RUN mvn dependency:go-offline
#
#COPY src ./src
#RUN mvn clean package -DskipTests
#
#FROM openjdk:17-jdk-slim
#
#WORKDIR /app
#
#COPY --from=build /app/target/wedding-invation-0.0.1-SNAPSHOT.jar .
#
#EXPOSE 8080
#
#ENTRYPOINT ["java", "-jar", "app/target/wedding-invation-0.0.1-SNAPSHOT.jar"]