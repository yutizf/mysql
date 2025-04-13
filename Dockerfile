FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean install -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/mysql-0.0.1-SNAPSHOT.jar"]