FROM eclipse-temurin:17

LABEL mentainer="koushambha39@gmail.com"

WORKDIR /app

COPY target/chat-socket-0.0.1-SNAPSHOT.jar /app/chat-docker-demo.jar

ENTRYPOINT ["java", "-jar", "chat-docker-demo.jar"]