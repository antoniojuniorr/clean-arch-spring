package io.github.antoniojuniorr.cleanarchspring.infra.persistence.mapper;

import io.github.antoniojuniorr.cleanarchspring.domain.model.Cliente;
import io.github.antoniojuniorr.cleanarchspring.infra.persistence.entity.ClienteEntity;

public class ClienteEntityMapper {
    public static ClienteEntity toClienteEnity(Cliente cliente) {
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setNome(cliente.nome());
        clienteEntity.setCpf(cliente.cpf());
        clienteEntity.setSituacaoCliente(cliente.situacaoCliente());
        return clienteEntity;
    }
}
