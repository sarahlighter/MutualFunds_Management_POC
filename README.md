# MutualFunds_Management_POC
# Quick Start
# Environment
-   [git](https://git-scm.com/)
-   [java11](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
-   [maven](http://maven.apache.org/)

## Deployment
All the microservices inside this repository are spring boot applications. Tomcat is embedded inside the **Spring Boot** , just run Spring boot application as `jar` file. It will start the tomcat inside it.

 - Start `[demo-eureka-server]`  and `[basic functions]` first.  Otherwise it will collapse.
   Check on `Spring Eureka dashboard` on fixed.
   port.`http://localhost:8761/`
   
 - The **port number** of all other Microservices are **dynamic** in order to create multiple instances more easily. Easy to scale by run or shut down instances of the service. Check the port number from Eureka dashboard

 - Start `[spring-boot-jwt]`. Post username and password for simulation login. 
 - Get JWT token after login from `[spring-boot-jwt]`, keep this token with request for validation. 
 - Start `[demo-eureka-financeproducts-console]` and
`[demo-eureka-financeproducts-service]`. 
`demo-eureka-financeproducts-service` implemented with Spring Data JPA which fetch data from MySQL database and eliminate boilerplate CRUD code. It is a RESTful Web Services, it will response in JSON format.

 - Check Mutual fund information from `demo-eureka-financeproducts-console` with get request.