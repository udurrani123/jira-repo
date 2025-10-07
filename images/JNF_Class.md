```mermaid
classDiagram
    class Dashboard {
        +showAttendanceRecords()
        +showGrades()
        +predictDropoutRisk()
    }
    class AcademicAdvisor {
        +viewDashboard()
    }
    AcademicAdvisor --> Dashboard : uses
```
