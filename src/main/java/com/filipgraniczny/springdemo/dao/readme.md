The `/dao` directory contains all files related to the data access layer and data access object.
- `/dao`
  - `PersonDao` is the interface that defines the operations to interact with the DAO with a person object.
  - `FakePersonDataAccessService` is an implementation of `PersonDao` using a `List` as a mock database.