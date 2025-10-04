# Stage 1: Build the project using Maven with Java 23
FROM maven:3.9.3-eclipse-temurin-23 AS build

# Set working directory
WORKDIR /app

# Copy Maven config and source code
COPY pom.xml .
COPY src ./src

# Build the project and skip tests
RUN mvn clean package -DskipTests

# Stage 2: Run the built jar with JDK 23
FROM eclipse-temurin:23-jdk

# Set working directory
WORKDIR /app

# Copy the jar file from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
