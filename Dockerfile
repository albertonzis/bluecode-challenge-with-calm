FROM openjdk:17-jre-slim
COPY target/interview-${project.version}.jar /app.jar
CMD ["java", "-jar", "/app.jar"]