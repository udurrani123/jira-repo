```mermaid
classDiagram
    direction LR
    User : +feedback()
    User : +review()
    Feedback : +getFeedback()
    Review : +submitReview()
    Feedback --> User : provides
    Review --> User : leads to
```
