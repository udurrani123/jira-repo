```mermaid
sequenceDiagram
    participant User
    participant System
    participant EmailService
    participant SMSService

    User->>System: Request password reset
    System->>User: Verify identity
    alt via Email
        System->>EmailService: Send verification code
        EmailService->>User: Deliver code
        User->>System: Enter code
        System->>User: Password reset success
    else via SMS
        System->>SMSService: Send verification code
        SMSService->>User: Deliver code
        User->>System: Enter code
        System->>User: Password reset success
    end

Note right of System: JIRA Issue JNF-165: Enhance student portal for password reset via email and SMS verification
```
