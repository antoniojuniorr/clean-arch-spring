package io.github.antoniojuniorr.cleanarchspring.infra.gateways;

import io.github.antoniojuniorr.cleanarchspring.application.gateways.ClienteGateway;
import io.github.antoniojuniorr.cleanarchspring.domain.model.Cliente;
import io.github.antoniojuniorr.cleanarchspring.infra.persistence.mapper.ClienteEntityMapper;
import io.github.antoniojuniorr.cleanarchspring.infra.persistence.repository.ClienteRepository;
import org.springframework.stereotype.Component;

@Component
public class  ClienteRepositoryGateway implements ClienteGateway {

    private final ClienteRepository clienteRepository;

    public ClienteRepositoryGateway(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void inserir(Cliente cliente) {
        clienteRepository.save(ClienteEntityMapper.toClienteEnity(cliente));
    }
}
