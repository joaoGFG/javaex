package fiap.exercise.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import fiap.exercise.security.service.TokenService;

@RestController
public class AuthController {

    private final TokenService tokenService;   
    
    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    public record TokenResponse(String token, String username) {}

    @PostMapping("/login")
    public TokenResponse login(Authentication authentication) {
        String username = authentication.getName();
        String token = tokenService.generateToken(username);
        return new TokenResponse(token, username);
    }
}
