package fiap.exercise.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fiap.exercise.security.model.Password;

public interface PasswordRepository extends JpaRepository<Password, Long> {

}
