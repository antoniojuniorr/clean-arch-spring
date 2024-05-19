package io.github.antoniojuniorr.cleanarchspring.infra.controllers.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ClienteInserirRequest(
        @NotEmpty(message = "O nome não pode estar em branco ou nulo")
        @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
        String nome,

        @NotEmpty(message = "O CPF não pode estar em branco ou nulo")
        @Pattern(regexp = "\\d{11}", message = "O CPF deve ter 11 dígitos")
        String cpf,

        @NotEmpty(message = "A situação não pode esta branca ou nula")
        String situacaoCliente
) {
}
