```mermaid
classDiagram
    class StudentPortal {
        +resetPasswordWithEmail()
        +resetPasswordWithSMS()
    }
    class User {
        -email
        -phoneNumber
    }
    StudentPortal --> User
```