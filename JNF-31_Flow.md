```mermaid
flowchart TB
A[Start] --> B{Is it a Flow Diagram?}
B -- Yes --> C[Generate Flow Diagram]
B -- No --> D[Process Next Type]
C --> E[Render via Kroki]
E --> F[Save to GitHub]
```