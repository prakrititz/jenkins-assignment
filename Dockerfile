FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN javac ToDoApp.java
CMD ["java", "ToDoApp"]