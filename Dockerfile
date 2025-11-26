FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN javac ToDoApp.java
CMD ["java", "ToDoApp"]