# Job Posting Platform

A web application for job posting where employers can post job opportunities and hire employees based on their profiles, job descriptions, and required technologies.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Employers can create job posts with detailed descriptions and required technologies.
- Users can view job posts and apply for jobs.
- Profile management for job seekers and employers.
- Secure authentication and authorization.

## Tech Stack

- **Frontend:** React
- **Backend:** Spring Boot
- **Database:** MongoDB Atlas (cloud-based)
- **Other Tools:** Maven, npm

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Java 11 or higher
- Node.js and npm
- Maven
- MongoDB Atlas account

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/rohankatale/job-posting-platform.git
    cd job-posting-platform
    ```

2. **Backend Setup:**

    Navigate to the backend directory and install the dependencies:

    ```bash
    cd backend
    mvn clean install
    ```

3. **Frontend Setup:**

    Navigate to the frontend directory and install the dependencies:

    ```bash
    cd ../frontend
    npm install
    ```

### Running the Application

1. **Start the Backend:**

    Ensure you have configured your MongoDB Atlas credentials in the `application.properties` file (see [Configuration](#configuration)).

    ```bash
    cd backend
    mvn spring-boot:run
    ```

2. **Start the Frontend:**

    In a new terminal window, navigate to the frontend directory and start the React development server:

    ```bash
    cd frontend
    npm start
    ```

    The frontend will be available at `http://localhost:3000`.

## Configuration

### Backend Configuration

Configure the MongoDB connection in the `backend/src/main/resources/application.properties` file:

```properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/<dbname>?retryWrites=true&w=majority
```
## Usage

### Creating Job Posts:

1. Employers can sign up and log in to their accounts.
2. Navigate to the "Create Job Post" section and fill in the job details.
3. Submit the form to create a new job post.

### Applying for Jobs:

1. Job seekers can browse job listings.
2. Click on a job post to view details.
3. Apply for the job by submitting their profile and relevant information.


