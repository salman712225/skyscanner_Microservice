# 🏝️ Hoen Scanner Microservice

A Dropwizard-based microservice for Skyscanner that surfaces hotel and rental car listings for the mysterious Hoen Archipelago. Users can search by city and receive results pulled from local JSON data files.

---

## 🚀 Features

- Accepts city-based search queries via a `/search` POST endpoint.
- Returns hotel and rental car listings matching the requested city.
- Built with Dropwizard and Jackson for efficient microservice architecture and JSON handling.

---

## 📦 Tech Stack

- **Java 19 (OpenJDK)**
- **Dropwizard Framework**
- **Jackson for JSON parsing**
- **Maven for build management**

---

## 📁 Project Structure

hoen-scanner/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com.hoenscanner.api/ # Search and SearchResult model classes
│ │ │ ├── com.hoenscanner.resources/ # REST resource (SearchResource.java)
│ │ │ └── com.hoenscanner/ # Application entry point
│ │ └── resources/
│ │ ├── hotels.json # Hotel listings
│ │ └── rental_cars.json # Rental car listings
├── pom.xml
└── README.md


---

## 🛠️ Setup Instructions

### 1. Prerequisites

- [Java 19 (OpenJDK)](https://jdk.java.net/19/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

### 2. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/hoen-scanner.git
cd hoen-scanner


3. Open in IntelliJ
Open the project in IntelliJ.

Load Maven dependencies when prompted.

Set the JDK to version 19 if needed.

4. Run the Application
Click the green run arrow in IntelliJ or use:

mvn clean package
java -jar target/hoen-scanner-1.0-SNAPSHOT.jar server config.yml

You should see: Welcome to Hoen Scanner!

🔍 API Usage
Endpoint
POST /search

Request Format

{
  "city": "petalborough"
}


Example Response

[
  {
    "city": "petalborough",
    "kind": "hotel",
    "title": "Oceanview Inn"
  },
  {
    "city": "petalborough",
    "kind": "rental car",
    "title": "Hoen Rentals - Main Street"
  }
]

Testing with Postman
Download Postman

Create a new POST request to:
http://localhost:8080/search

Set the Body to raw and choose JSON.

Use:

{
  "city": "rustburg"
}

Click Send and view the results.

✅ Supported Cities
petalborough

rustburg

shaleport

📬 Submitting Your Work
After testing:

git add .
git commit -m "Complete Hoen Scanner microservice"
git push origin main

Then submit your repository URL to Skyscanner for review.

📄 License
This project is part of the Skyscanner Engineering Task and not intended for production use.


---

Would you like a version tailored for deployment (e.g. Docker support or CI/CD instructions) as well?
