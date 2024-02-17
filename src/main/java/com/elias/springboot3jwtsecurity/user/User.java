package com.elias.springboot3jwtsecurity.user;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User  implements Serializable
{
    @GeneratedValue
    private Integer id;
    private String username;
    private String lastname;
    private String email;
    private String password;
}
