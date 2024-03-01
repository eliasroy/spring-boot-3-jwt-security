package com.elias.springboot3jwtsecurity.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api/v1/demo-controller") //localhost:8080/api/v1/auth
@RequiredArgsConstructor
public class DemoController {
    @GetMapping
    public String sayHello() {
        return "Hello from secured endpoint"; //200 OK, 201 CREATED, 400 BAD REQUEST, 401 UNAUTHORIZED, 403 FORBIDDEN, 404 NOT FOUND, 500 INTERNAL SERVER ERROR, 501 NOT IMPLEMENTED, 502 BAD GATEWAY, 503 SERVICE UNAVAILABLE, 504 GATEWAY TIMEOUT
    }
}
