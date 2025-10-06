```mermaid
flowchart TD
    A[User Request: "Create a Flow diagram for JIRA issue JNF-115"] --> B{Input Valid?}
    B -->|Yes| C[JIRA_MCP_Client: Fetch Issue JNF-115]
    C --> D[Title: Integrate notification system in university mobile app to alert students about assignment deadlines, exams, and announcements with customizable reminder settings]
    B -->|No| E[Error: Invalid format]
    C --> F[Generate Mermaid Code]
    F --> G[Kroki.io: Render Diagram]
    G --> H[GH_CreateFile: Save as JNF-115_Flow.md]
    H --> I[Success: Diagram saved!]
    G -->|Fail| J[Retry Kroki.io]
    J -->|Still Fails| K[Error: Rendering failed]
```