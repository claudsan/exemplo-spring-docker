FROM openjdk:19-ea-26-jdk-slim
WORKDIR /demo-docker
COPY target/aplicacaodocker-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/demo-docker/demo.jar"]