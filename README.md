# Spring Boot Tutorial

### Installation 

Create a Spring Boot Application via [Spring Initializer] (https://start.spring.io/).
Switch to Full Version on Configurations
Checked the following
```
Web
JPA
Apache Derby
Actuator
```

Import to Eclipse/IntelliJ via Maven Project and Run

Hit the [server](http://localhost:8080/actuator) to see if its working


Expected result:
```json
{
    "_links": {
        "self": {
            "href": "http://localhost:8080/actuator",
            "templated": false
        },
        "health": {
            "href": "http://localhost:8080/actuator/health",
            "templated": false
        },
        "info": {
            "href": "http://localhost:8080/actuator/info",
            "templated": false
        }
    }
}
```

### References
https://www.youtube.com/watch?v=msXL2oDexqw&list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO
