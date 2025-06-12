# Usa Java 21 LTS
FROM eclipse-temurin:21-jdk

# Crea y cambia al directorio de trabajo
WORKDIR /app

# Copia todos los archivos
COPY . .

# Da permisos de ejecución al wrapper de Maven
RUN chmod +x mvnw

# Ejecuta el build con Maven wrapper
RUN ./mvnw clean package -DskipTests

# Expón el puerto de Spring Boot
EXPOSE 8080

# Arranca el microservicio
CMD ["java", "-jar", "target/microservicio-status-0.0.1-SNAPSHOT.jar"]
