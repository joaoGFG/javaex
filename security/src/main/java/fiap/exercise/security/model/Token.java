package fiap.exercise.security.model;

public record Token(
    String token,
    String type,
    String username
) {
}