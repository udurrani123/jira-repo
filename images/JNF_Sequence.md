```mermaid
sequenceDiagram
    participant Student
    participant System
    Student->>System: Request password reset
    System->>Student: Send verification options
    alt Email verification
        Student->>System: Verify email
    else SMS verification
        Student->>System: Verify SMS
    end
    System->>Student: Password reset link
```