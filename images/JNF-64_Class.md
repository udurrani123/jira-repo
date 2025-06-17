```mermaid
classDiagram
    class User {
        +String name
        +int age
        +getDetails()
    }
    class Product {
        +String productName
        +double price
        +getPrice()
    }
    User --> Product : purchases
```
