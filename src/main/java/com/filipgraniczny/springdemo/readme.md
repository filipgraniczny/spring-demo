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

**Annotations:**
- `@Repository("%nameOfRepo%")`: tells Spring this class needs to be instantiated as a bean so that we can inject it into other classes (in other words, this class is served as a Repository)
- `@Service`: tells Spring that this class is a Service. We can inject the repository class into this class
- `@Autowired`: tells spring that we are autowiring, or injecting, into the interface used by the constructor/method.
- `@Qualifier("%nameOfRepo%")`: identifies which repository class we want to inject. This is added before the parameter type in the constructor.
- `@RestController`: enables the class to have methods that respond to REST calls
- `@PostMapping`: tells Spring that this method will be used with a POST request
- `@GetMapping`: tells Spring that the method will be used with a GET request
- `@JsonProperty("%propertyName%")`: when put in front of the model class constructor's parameters, it maps an incoming REST json property to that parameter.
- `@RequestBody`: Tells the POST-mapped method to get the selected method parameter from the POST request's body (it is placed before the appropriate parameter)
- `@RequestMapping("%url%)`: sets the endpoint URL for the controller class (ex: `"api/v1/person"`)