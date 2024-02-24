package com.elias.springboot3jwtsecurity.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisternRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
