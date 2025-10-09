```mermaid
sequenceDiagram
    participant User as User
    participant System as System
    participant Jira as Jira MCP Client

    User->>System: Request to create a Sequence diagram for JIRA issue JNF-157
    System->>Jira: Fetch issue details for JNF-157
    Jira-->>System: Return issue title, description, metadata
    System->>System: Generate Mermaid sequence diagram code
    System->>Kroki.io: Render Mermaid sequence diagram
    Kroki.io-->>System: Return rendered diagram image
    System->>GitHub: Save Mermaid code as images/JNF-157_Sequence.md
    GitHub-->>System: Confirm file saved
