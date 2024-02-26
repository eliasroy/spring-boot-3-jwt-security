package com.elias.springboot3jwtsecurity.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth") //localhost:8080/api/v1/auth
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;
    @PostMapping("/register")
    public ResponseEntity<AuthehenticationResponse> register(
            @RequestBody RegisternRequest request)
    {

        return ResponseEntity.ok(service.register(request)); //200 OK, 201 CREATED, 400 BAD REQUEST, 401 UNAUTHORIZED, 403 FORBIDDEN, 404 NOT FOUND, 500 INTERNAL SERVER ERROR, 501 NOT IMPLEMENTED, 502 BAD GATEWAY, 503 SERVICE UNAVAILABLE, 504 GATEWAY TIMEOUT
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthehenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request)
    {

        return ResponseEntity.ok(service.authenticate(request)); //200 OK, 201 CREATED, 400 BAD REQUEST, 401 UNAUTHORIZED, 403 FORBIDDEN, 404 NOT FOUND, 500 INTERNAL SERVER ERROR, 501 NOT IMPLEMENTED, 502 BAD GATEWAY, 503 SERVICE UNAVAILABLE, 504 GATEWAY TIMEOUT
    }


}
