# Restaurant Review System

A full-stack restaurant review platform featuring a modern Next.js frontend, a Spring Boot backend, and secure authentication/authorization via Keycloak. The system leverages Elasticsearch for fast, scalable search and analytics.

---

## Tech Stack
- **Frontend:** Next.js 14, React 18, Tailwind CSS, TypeScript
- **Backend:** Java 21, Spring Boot 3.5, Spring Security, OAuth2 Resource Server, Elasticsearch, Kibana
- **Authentication:** Keycloak (Dockerized)
- **DevOps:** Docker, Docker Compose, Maven

---

## Requirements
- Java 21+
- Node.js 18+ and npm
- Docker & Docker Compose
- Maven (optional, for backend builds)

---

## Setup Instructions

### 1. Clone the Repository
```sh
git clone <your-repo-url>
cd Restaurant\ Review\ System
```

### 2. Start Docker Services
```sh
cd backend
docker-compose up -d
```
- Elasticsearch: [http://localhost:9200](http://localhost:9200)
- Kibana: [http://localhost:5601](http://localhost:5601)
- Keycloak: [http://localhost:9090](http://localhost:9090) (admin/admin)

### 3. Configure Keycloak
- Go to [http://localhost:9090](http://localhost:9090) (Keycloak admin console)
- **Add a new realm:**
  - Name: `restaurant-review`
- **Create a new client:**
  - In the `restaurant-review` realm, click Clients > Create client.
  - Set **Client ID** to `frontend-app`.
  - Set **Client type** to `OpenID Connect`.
  - Set **Root URL** to `http://localhost:3000`.
  - Set **Valid Redirect URIs** to `http://localhost:3000/*`.
  - Set **Web Origins** to `http://localhost:3000`.
- **Add a test user:**
  - Go to Users > Add user
  - Set username: `test`
  - Set email, first name, last name as desired
  - Click Create
  - Go to the Credentials tab
  - Click Set Password, set the password to `test` and turn off "Temporary" (for development only)

### 4. Run the Backend
```sh
cd backend
./mvnw spring-boot:run
```
Or build and run the JAR:
```sh
./mvnw clean package
java -jar target/restaurant-0.0.1-SNAPSHOT.jar
```

### 5. Run the Frontend
```sh
npm install
npm run dev
```
Visit [http://localhost:3000](http://localhost:3000)

---

## Environment Variables
- **Frontend:** `.env.local` — Configure your API endpoints and Keycloak client info here.
- **Backend:** Update `application.properties` as needed for Keycloak and Elasticsearch.

---

## Useful Commands
- Start all Docker services: `docker-compose up -d`
- Stop all Docker services: `docker-compose down`
- Clean frontend: `npm run clean`
- Lint frontend: `npm run lint`

---

## Dependencies

### Backend (`pom.xml`)
- Spring Boot (Web, Security, Validation, Elasticsearch, OAuth2)
- Lombok
- MapStruct

### Frontend (`package.json`)
- Next.js, React, Tailwind CSS, Axios, React OIDC Context, Radix UI, etc.

---

## Notes
- Keycloak is set up in development mode with an H2 database.
- Elasticsearch and Kibana are for search and analytics.
- Adjust Keycloak, Elasticsearch, and backend configurations as needed for production.

---

## Loading Test Data
- Go to the `backend/src/test/java/com/devtiro/restaurant/manual/` folder.
- Run the `RestaurantDataLoaderTest` test.
- This will load all the test restaurant data into your system.

---

## Quick Reference Table

| Setting                | Value                        |
|------------------------|------------------------------|
| Keycloak Realm         | restaurant-review            |
| Client ID              | frontend-app                 |
| Test User Username     | test                         |
| Test User Password     | test                         |
| Keycloak URL           | http://localhost:9090        |
| Frontend Redirect URI  | http://localhost:3000/*      |

---
