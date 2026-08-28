# Server/Client (Java)

A simple client-server application demonstrating socket programming in Java. The server echoes client messages in uppercase, showcasing TCP communication, resource management, and clean error handling.

## 🔧 How It Works

1. **Server** starts and listens for connections on port 12345
2. **Client** connects to the server
3. **Client** sends a message
4. **Server** receives it, converts to uppercase, and sends it back
5. **Client** displays the response

## 🛠️ Technologies

- Java Sockets
- TCP/IP Networking
- Try-with-resources

## 🚀 How to Run


# Compile
```bash
javac Server.java Client.java
```

# Start Server (in one terminal)
```bash
java Server
```

# Start Client (in another terminal)
```bash
java Client
```