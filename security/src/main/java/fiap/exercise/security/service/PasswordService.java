package fiap.exercise.security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fiap.exercise.security.model.Password;
import fiap.exercise.security.repository.PasswordRepository;

@Service
public class PasswordService {
    

    private final PasswordRepository passwordRepository;

    PasswordService(PasswordRepository passwordRepository){
        this.passwordRepository = passwordRepository;
    }

    public List<Password> getAllPasswords() {
        return passwordRepository.findAll();
    }
}
