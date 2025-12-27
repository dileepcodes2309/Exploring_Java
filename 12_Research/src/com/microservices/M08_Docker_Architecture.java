package com.microservices;

public class M08_Docker_Architecture {
    public static void main(String[] args) {
        String architecture = """
Docker follows a client-server architecture.

- Docker Client:
  The Docker client is used by users to interact with Docker using commands like
  docker build, docker run, and docker pull.

- Docker Daemon:
  The Docker daemon runs in the background and is responsible for building images,
  creating containers, managing networks, and volumes.

- Docker Images:
  Docker images are read-only templates that contain the application code,
  runtime, libraries, and dependencies required to run an application.

- Docker Containers:
  A container is a running instance of a Docker image. Containers are lightweight,
  isolated, and share the host operating system kernel.

- Dockerfile:
  A Dockerfile is a configuration file containing instructions to build a Docker image.

- Docker Registry:
  A Docker registry is used to store and distribute Docker images.
  Examples include Docker Hub and private registries.

Overall flow:
Docker Client → Docker Daemon → Docker Image → Docker Container
""";

    }
}
