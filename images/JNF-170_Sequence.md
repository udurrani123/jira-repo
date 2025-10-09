```mermaid
sequenceDiagram
    participant User
    participant Jira
    participant Assistant

    User->>Assistant: Request sequence diagram for JNF-170
    Assistant->>Jira: Fetch issue JNF-170 details
    Jira-->>Assistant: Return issue title and description
    Assistant->>Assistant: Generate Mermaid sequence diagram code
    Assistant->>Kroki.io: Render sequence diagram
    Kroki.io-->>Assistant: Return rendered diagram
    Assistant->>GitHub: Save JNF-170_Sequence.md
    GitHub-->>Assistant: Confirm save
    Assistant->>User: Success message with GitHub file link
```