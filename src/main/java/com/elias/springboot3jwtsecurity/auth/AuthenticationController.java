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



    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthehenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request)
    {

    }


}
