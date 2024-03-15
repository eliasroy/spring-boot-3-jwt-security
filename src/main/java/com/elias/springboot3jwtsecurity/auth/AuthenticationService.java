package com.elias.springboot3jwtsecurity.auth;

import com.elias.springboot3jwtsecurity.config.JwtService;
import com.elias.springboot3jwtsecurity.mapper.IUserMapper;
import com.elias.springboot3jwtsecurity.user.Role;
import com.elias.springboot3jwtsecurity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final IUserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthehenticationResponse register(RegisternRequest request) {
        var user = User.builder()
                .firsname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        userMapper.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthehenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthehenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = userMapper.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthehenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
