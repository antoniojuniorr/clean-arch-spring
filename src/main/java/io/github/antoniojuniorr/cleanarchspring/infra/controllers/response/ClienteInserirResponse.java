package io.github.antoniojuniorr.cleanarchspring.infra.controllers.response;

import io.github.antoniojuniorr.cleanarchspring.domain.enums.SituacaoCliente;

public record ClienteInserirResponse(String nome, String cpf, SituacaoCliente situacaoCliente) {
}
