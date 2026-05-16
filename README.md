# 🏏 IPL Microservices Project

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=28&pause=1000&color=00C2FF&center=true&vCenter=true&width=900&lines=Spring+Boot+Microservices+Architecture;API+Gateway+%7C+Eureka+Server+%7C+Config+Server;Circuit+Breaker+with+Resilience4j;Centralized+Logging+using+ELK+Stack;Production+Ready+Microservices+Project" alt="Typing SVG" />

<br><br>

<img src="https://img.shields.io/github/repo-size/Abhisek-Git-01/ipl-microservices-project?color=blue">
<img src="https://img.shields.io/github/last-commit/Abhisek-Git-01/ipl-microservices-project?color=green">
<img src="https://img.shields.io/github/stars/Abhisek-Git-01/ipl-microservices-project?style=social">
<img src="https://img.shields.io/badge/Java-17-orange">
<img src="https://img.shields.io/badge/SpringBoot-3.x-brightgreen">
<img src="https://img.shields.io/badge/Microservices-Architecture-blueviolet">
<img src="https://img.shields.io/badge/Logging-ELKStack-yellow">

</div>

---

# 🚀 Project Overview

This project demonstrates a **real-world Microservices Architecture** using **Spring Boot** and **Spring Cloud** technologies.

The application is designed around IPL services where multiple independent microservices communicate through service discovery and API Gateway.

---

# ✨ Features

✅ API Gateway Routing  
✅ Eureka Service Registry  
✅ Config Server  
✅ Circuit Breaker using Resilience4j  
✅ Distributed Centralized Logging using ELK Stack  
✅ Spring Boot Actuator Monitoring  
✅ Inter-service Communication  
✅ Fault Tolerance Handling  
✅ Centralized Configuration Management  
✅ Real-time Error Dashboard in Kibana  

---

# 🧩 Microservices Included

| Service | Description |
|---|---|
| 🟢 Eureka Server | Service Registry & Discovery |
| 🟢 API Gateway | Centralized Routing |
| 🟢 Config Server | Centralized Configuration |
| 🟢 IPL Player Service | Player Management APIs |
| 🟢 IPL Team Service | Team Management APIs |
| 🟢 Admin Server | Monitoring & Management |

---

# 🏗️ Architecture Diagram

```text
                    +-------------------+
                    |   Config Server   |
                    +-------------------+
                              |
                              v
+-------------+      +----------------+      +----------------+
| IPL Player  | ---> |  API Gateway   | ---> | IPL Team       |
| Service     |      +----------------+      | Service        |
+-------------+               |              +----------------+
                              |
                              v
                    +-------------------+
                    |  Eureka Server    |
                    +-------------------+

                              |
                              v
                    +-------------------+
                    |   ELK Stack       |
                    | Elasticsearch     |
                    | Logstash          |
                    | Kibana            |
                    +-------------------+
