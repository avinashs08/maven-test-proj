# Stage 1: build the jar with Maven + JDK 17
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn package -DskipTests -B

# Stage 2: small runtime image with only the JRE
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/evenodd-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]