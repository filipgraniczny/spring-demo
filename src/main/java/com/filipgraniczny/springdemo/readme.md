**This is the main directory of the source code.**

Here, we have 4 subdirectories:
- `/api`: API/Controller Layer
- `/dao`: Data Access Layer
  - **DAO** means Data Access Object
    - the object/interface used to access data from a database
    - isolates the application/business layer from the persistence layer (database, etc.) using an abstract API
- `/service`: Business/Service Layer
- `/model`: The model
  - the "business data" of the application
  - the "what" of the application, the data that the application is about
  - in this case, the model consists of entities/items that we will eventually add to our database. or more specificaly, the ***user***.
  
**The Dependency Inversion Principle** (also known as **_Dependency Injection Principle_**):
- code should depend upon abstraction
- we decouple implementations from each other