```mermaid
sequenceDiagram
    participant User
    participant System
    User->>System: Request to add new car registration record
    System-->>User: Confirmation of record
    User->>System: Enter details for new car
    System-->>User: Save details
    User-->>System: Request to view all registrations
    System-->>User: Display all registrations
```