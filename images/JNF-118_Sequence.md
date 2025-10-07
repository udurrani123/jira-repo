```mermaid
sequenceDiagram
    participant User
    participant System
    participant Database

    User->>System: Request details for JNF-118
    System->>Database: Query issue JNF-118
    Database-->>System: Return issue data
    System-->>User: Present issue details (Develop a dashboard for academic advisors showing real-time student performance analytics including attendance records, grades, and predicted dropout risk.)
```