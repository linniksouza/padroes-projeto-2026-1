import java.time.ZonedDateTime;

public record Post(
    String titulo,
    String conteudo,
    ZonedDateTime data
) {}
