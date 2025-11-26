To-Do List Application (Automated with Jenkins & Docker)

A simple Command Line Interface (CLI) To-Do List application written in Java. This project demonstrates a complete CI/CD pipeline using Jenkins to automate building, testing, and containerizing the application with Docker.

🚀 Project Overview

Application: Java CLI (Add tasks, View tasks).

Automation: Jenkins Pipeline.

Containerization: Docker.

Base Image: eclipse-temurin:17-jdk-alpine.

🛠️ Prerequisites

To run this project locally or rebuild the pipeline, you need:

Java JDK 17 (or higher)

Docker Desktop (Running with WSL 2 on Windows)

Jenkins (For automation)

🏃‍♂️ How to Run Locally

Option 1: Using Java

If you have Java installed, you can compile and run the source code directly.

# Compile
javac ToDoApp.java

# Run
java ToDoApp


Option 2: Using Docker (Recommended)

You can run the application inside a container without installing Java.

# Build the image
docker build -t todo-app .

# Run the container
docker run -it todo-app


⚙️ Jenkins Pipeline

This repository includes a Jenkinsfile (Pipeline script) that automates the following stages:

Pull Code: Fetches the latest code from the main branch of this GitHub repository.

Build: Compiles the Java source files (javac ToDoApp.java).

Test: Runs the automated test script (java TestToDoApp) to verify functionality.

Create Docker Image: Builds a lightweight Docker image using eclipse-temurin:17-jdk-alpine.

Pipeline Script

pipeline {
    agent any
    stages {
        stage('Pull Code') {
            steps {
                git branch: 'main', url: '[https://github.com/YOUR_USERNAME/jenkins-assignment](https://github.com/YOUR_USERNAME/jenkins-assignment)'
            }
        }
        stage('Build') {
            steps {
                bat 'javac ToDoApp.java TestToDoApp.java'
            }
        }
        stage('Test') {
            steps {
                bat 'java TestToDoApp'
            }
        }
        stage('Create Docker Image') {
            steps {
                bat 'docker build -t todo-app .'
            }
        }
    }
}


🐳 DockerHub

After a successful build, the image is tagged and pushed to DockerHub.

Pull the image:

docker pull YOUR_DOCKERHUB_USERNAME/YOUR_ROLL_NUMBER


📂 Project Structure

ToDoApp.java - Main application source code.

TestToDoApp.java - Automated test script.

Dockerfile - Configuration to package the app into a container.

README.md - Project documentation.