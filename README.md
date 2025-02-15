# JavaVPN

## Overview
JavaVPN is a simple Virtual Private Network (VPN) implementation using Java. It establishes a secure tunnel between a VPN client and a VPN server, enabling encrypted communication over the internet or local network.

## Features
- Secure client-server communication
- Basic encryption for data transmission
- Cross-platform support (Mac, Windows, Linux)
- Lightweight and easy to deploy

## Project Structure
```
JavaVPN/
│── src/
│   ├── VPNServer.java
│   ├── VPNClient.java
│── lib/                # External dependencies (JAR files)
│── bin/                # Compiled Java class files
│── README.md
│── .gitignore
│── settings.json       # VS Code project settings
```

## Prerequisites
- Java Development Kit (JDK 17 or later)
- VS Code (or any Java-compatible IDE)
- Git (for version control)

## Setup Instructions
### 1. Clone the Repository
```sh
git clone https://github.com/GANDHARVA7REDDY/JavaVPN.git
cd JavaVPN
```

### 2. Compile the Project
```sh
javac -cp "lib/*" -d bin src/VPNServer.java src/VPNClient.java
```

### 3. Run the VPN Server
```sh
java -cp bin VPNServer
```

### 4. Run the VPN Client
On another terminal:
```sh
java -cp bin VPNClient
```

## Usage
1. Start the VPN Server.
2. Connect the VPN Client to the server.
3. Secure messages can be exchanged between the client and server.

## Troubleshooting
- **Error: Could not find or load main class VPNServer**
  - Ensure you are running the correct command from the project root.
  - Recompile using `javac -cp "lib/*" -d bin src/VPNServer.java`.

- **Permission Denied on GitHub Push**
  - Use a **GitHub Personal Access Token (PAT)** instead of a password.
  - Run: `git push -u origin main` and enter the token when prompted.

## Future Enhancements
- Implement stronger encryption techniques
- Add multi-client support
- Improve error handling and logging

## Contributing
Feel free to contribute by creating pull requests or reporting issues.



