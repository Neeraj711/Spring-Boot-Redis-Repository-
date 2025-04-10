# Spring-Boot-Redis-Repository-
A minimal Spring Boot project demonstrating how to use Redis Repository for storing and retrieving data without using any relational database like PostgreSQL or MySQL.

📦 Features
✅ Spring Boot + Spring Data Redis

✅ Redis as the primary data store

✅ CRUD operations using Redis Repository

✅ Configurable Redis connection via application.properties

✅ Clean code structure with RESTful APIs

🛠️ Tech Stack
Java 17+

Spring Boot 3.x

Spring Data Redis

Redis Server

Maven

⚙️ Setup Instructions
1. Clone the Repo
bash

git clone https://github.com/your-username/spring-boot-redis-repository.git
cd spring-boot-redis-repository
2. Run Redis Server
Make sure Redis is running locally on port 6379.

bash

redis-server
Or using Docker:

bash
Copy
Edit
docker run --name redis -p 6379:6379 -d redis
3. Run the App

./mvnw spring-boot:run
📁 Example Redis Entity
java
Copy
Edit
@RedisHash("User")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
}
🧠 Example Repository

public interface UserRepository extends CrudRepository<User, String> {}
📡 Example REST API
Method	Endpoint	Description
GET	/users	List all users
GET	/users/{id}	Get user by ID
POST	/users	Create a new user
PUT	/users/{id}	Update user by ID
DELETE	/users/{id}	Delete user by ID
🧪 Sample cURL
bash

curl -X POST http://localhost:8080/users \
     -H "Content-Type: application/json" \
     -d '{"name": "Alice", "email": "alice@example.com"}'
✅ Output: Redis Keys
Redis keys are automatically stored with the prefix "User:", and all data is managed in Redis itself.



