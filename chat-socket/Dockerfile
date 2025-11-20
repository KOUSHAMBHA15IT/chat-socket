FROM eclipse-temurin:24

LABEL mentainer="my-email"

WORKDIR /app

COPY target/chat-socket-0.0.1-SNAPSHOT.jar /app/chat-docker-demo.jar

ENTRYPOINT ["java", "-jar", "chat-docker-demo.jar"]
