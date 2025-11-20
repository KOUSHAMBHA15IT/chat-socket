# 💬⚡Real-Time Chat Application

A sleek and modern real-time chat application built with **Spring Boot**, **WebSocket (STOMP over SockJS)**, and **Thymeleaf**. It supports **emojis**, futuristic UI elements, and smooth bi-directional communication between users via WebSocket technology.

---

## 🚀 Features

- 🌐 Real-time messaging with WebSockets (STOMP + SockJS)
- 🔒 Unique session usernames (no registration required)
- 🌈 Responsive and animated UI using CSS3 and JS

---

## 🛠️ Tech Stack

### Backend
- ✅ Spring Boot (Java 24)
- ✅ WebSocket with STOMP Protocol
- ✅ SockJS fallback support
- ✅ Maven for build

### Frontend
- ✅ Thymeleaf template engine
- ✅ Vanilla JS + Emoji Picker Library
- ✅ Futuristic UI using CSS Glassmorphism & Neon buttons

### A futuristic WebSocket-powered chat system built with Spring Boot, Docker & Cloud Deployments.

<p align="center"> <img src="https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen?style=for-the-badge" /> <img src="https://img.shields.io/badge/WebSocket-STOMP-blue?style=for-the-badge" /> <img src="https://img.shields.io/badge/Docker-Enabled-2496ED?style=for-the-badge&logo=docker&logoColor=white" /> <img src="https://img.shields.io/badge/Render-Cloud-blueviolet?style=for-the-badge" /> </p>

# 📦 Dockerizing the Application

> [!TIP]
> This setup ensures your Spring Boot Chat App runs consistently on any machine, any OS, and any cloud provider.

---

## 🔨 Step 1: Build the JAR

First, package your application into a production-ready JAR file:

```bash
mvn clean package -DskipTests
```

**What this does:**
- Compiles your code
- Runs the build process
- Generates the JAR under the `target/` directory
- Skips tests for faster builds

---

## 🐳 Step 2: Build the Docker Image

Create a containerized version of your application:

```bash
docker build -t chat-app:latest .
```

**What this does:**
- Reads the `Dockerfile` in your project root
- Creates a lightweight, optimized Docker image
- Tags it as `chat-app:latest` for easy reference

---

## ▶️ Step 3: Run the Application

Start your containerized application:

```bash
docker run -p 8080:8080 chat-app:latest
```

**Access your app at:** 👉 **http://localhost:8080**

**What this does:**
- Runs the container in the foreground
- Maps port 8080 from container to your host machine
- Makes the app accessible via your browser

---

<br>

# 🚢 Publishing to Docker Hub

> [!NOTE]
> Required if you want to deploy on **Render**, **Railway**, **AWS**, **GCP**, **Azure**, or allow others to run your app with a single command.

---

## 🔐 Step 1: Login to Docker Hub

Authenticate with your Docker Hub account:

```bash
docker login
```

Enter your Docker Hub username and password when prompted.

---

## 🏷️ Step 2: Tag Your Image

Tag your local image with your Docker Hub username:

```bash
docker tag chat-app:latest <your-dockerhub-username>/chat-app:latest
```

**Example:**
```bash
docker tag chat-app:latest koushambha/chat-app:latest
```

---

## 🚀 Step 3: Push to Docker Hub

Upload your image to the cloud:

```bash
docker push <your-dockerhub-username>/chat-app:latest
```

**Example:**
```bash
docker push koushambha/chat-app:latest
```

Your image is now publicly available! 🎉

---

<br>

# 🌍 Run from Anywhere

Once published, **anyone** can pull and run your app from any machine:

```bash
docker run -p 8080:8080 <your-dockerhub-username>/chat-app:latest
```

**Example:**
```bash
docker run -p 8080:8080 johndoe/chat-app:latest
```

## Check out the live link at https://koushambha15it.github.io/chat_front/

### 💡 Use Cases:
- ☁️ Deploy on cloud platforms (AWS, GCP, Azure)
- 🖥️ Run on any development machine
- 🚀 Quick demos and testing environments
- 👥 Share with team members instantly

---

## 🛠️ Useful Docker Commands

| Command | Description |
|---------|-------------|
| `docker ps` | List running containers |
| `docker ps -a` | List all containers (including stopped) |
| `docker images` | List all Docker images |
| `docker stop <container-id>` | Stop a running container |
| `docker rm <container-id>` | Remove a container |
| `docker rmi <image-id>` | Remove an image |
| `docker logs <container-id>` | View container logs |

---

## 🎯 Next Steps

- [ ] Set up environment variables for production
- [ ] Configure Docker Compose for multi-container setups
- [ ] Implement CI/CD pipeline for automated builds
- [ ] Add health checks to your Dockerfile

---

<div align="center">

**Made with ❤️ using Docker & Spring Boot**

[Report Bug](https://github.com/yourusername/yourrepo/issues) · [Request Feature](https://github.com/yourusername/yourrepo/issues)

</div>
---
THE DEMO IS : 
https://github.com/user-attachments/assets/1a27a030-f460-458f-be02-9151fca401ee
