package io.github.antoniojuniorr.cleanarchspring.domain.model;

import io.github.antoniojuniorr.cleanarchspring.domain.enums.SituacaoCliente;

public record Cliente(String nome, String cpf, SituacaoCliente situacaoCliente) {
}
