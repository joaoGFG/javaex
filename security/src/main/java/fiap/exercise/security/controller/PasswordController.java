package fiap.exercise.security.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fiap.exercise.security.model.Password;
import fiap.exercise.security.service.PasswordService;


@RestController
public class PasswordController {
    
    private final PasswordService passwordService;

    PasswordController(PasswordService passwordService){
        this.passwordService = passwordService;
    }

    @GetMapping("/pass")
    public List<Password> getAllPasswords() {
        return passwordService.getAllPasswords();
    }
    
}
