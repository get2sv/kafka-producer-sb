
# Kafka Producer Service (Spring Boot)

This project is a simple Kafka Producer application developed using Java and Spring Boot. It is designed to send JSON messages to an Apache Kafka topic via a RESTful API. The application demonstrates how to integrate Spring Kafka for producing messages to Kafka clusters in microservice environments.

---

## 📌 Key Features

* REST API to publish messages
* Kafka Producer using `KafkaTemplate`
* JSON message serialization
* Externalized configuration using `application.yml`
* Easily configurable Kafka topic and broker details

---

## 🚀 Getting Started

### ✅ Prerequisites

* Java 17 or higher
* Maven 3.6 or higher
* Apache Kafka (Running locally or remotely)

---

### 📦 Installation & Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/your-username/kafka-producer-service.git
   cd kafka-producer-service
   ```

2. **Configure Kafka connection**
   Edit `src/main/resources/application.yml` or `application.properties`:

   ```yaml
   spring:
     kafka:
       bootstrap-servers: localhost:9092
       producer:
         key-serializer: org.apache.kafka.common.serialization.StringSerializer
         value-serializer: org.springframework.kafka.support.serializer.JsonSerializer
     template:
       default-topic: my-topic
   ```

3. **Build and run the application**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## 📡 API Endpoint

### POST `/api/publish`

Publishes a message to the Kafka topic.

#### Example Request:

```json
{
  "id": "101",
  "name": "John Doe",
  "email": "john@example.com"
}
```

#### Curl Example:

```bash
curl -X POST http://localhost:8080/api/publish \
     -H "Content-Type: application/json" \
     -d '{"id": "101", "name": "John Doe", "email": "john@example.com"}'
```

---

## 🛠 Technologies Used

* Java 17
* Spring Boot 3.x
* Apache Kafka
* Spring for Apache Kafka
* Maven
* Lombok (optional)

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/example/kafkaproducer/
│   │   ├── controller/       # REST endpoints
│   │   ├── model/            # DTO classes
│   │   ├── config/           # Kafka configurations
│   │   └── service/          # Kafka Producer logic
│   └── resources/
│       └── application.yml
└── pom.xml
```

---

## 🧑‍💻 Author

Saurabh Verma


---

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
