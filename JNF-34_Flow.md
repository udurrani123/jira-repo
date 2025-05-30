```mermaid
    graph TD;
        A[Start] --> B[Payment Processing];
        B --> C{Is Payment Successful?};
        C -->|Yes| D[Confirm Payment];
        C -->|No| E[Retry Payment];
        E --> B;
        D --> F[Send Confirmation Email];
        F --> G[End];
    ```