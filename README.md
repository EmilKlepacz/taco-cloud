### Taco Cloud

This app is created as a reference or some codebase for lookup
while creating some other 'serious' apps.

It contains some features of spring that every starting project could
have for further development with some examples.

#### What have been added here:

* db connection with jpa
* MVC design pattern (view rendered by Thymeleaf)
* validation for form fields
* validation at form binding
* displaying validation errors
* preloading data into tables
* definition for repository interfaces
* Spring Security:
    * authentication
    * o2auth by third party (github)
    * securing web request with SecurityFilterChain
    * custom login page
    * preventing CSRF
    * applying method level security
    * usage of @AuthenticationPrincipal for taking information about authenticated user
* fine-tuning autoconfiguration
* own configuration properties
* REST api <br>
  examples:
  ```bash
  curl -s "http://localhost:8080/api/tacos?recent" | jq
  ```

  ```bash
  curl "http://localhost:8080/api/tacos?recent&page=0&size=5" | jq
  ``` 
