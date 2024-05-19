package io.github.antoniojuniorr.cleanarchspring.infra.controllers.mapper;

import io.github.antoniojuniorr.cleanarchspring.domain.enums.SituacaoCliente;
import io.github.antoniojuniorr.cleanarchspring.domain.model.Cliente;
import io.github.antoniojuniorr.cleanarchspring.infra.controllers.request.ClienteInserirRequest;

public class ClienteMapper {
    public static Cliente toClienteModel(ClienteInserirRequest clienteInserirRequest) {
        return new Cliente(clienteInserirRequest.nome(), clienteInserirRequest.cpf(), SituacaoCliente.obterPorDescricao(clienteInserirRequest.situacaoCliente()));
    }
}
