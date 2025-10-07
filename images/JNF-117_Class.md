```mermaid
classDiagram
    class NotificationSystem {
        +String alertType
        +String message
        +Date deadline
        +Date examSchedule
        +String announcement
        +customizableReminders()
    }

    class UniversityMobileApp {
        +NotificationSystem notificationSystem
        +sendAlert()
        +setReminders()
    }

    UniversityMobileApp --> NotificationSystem : includes
```