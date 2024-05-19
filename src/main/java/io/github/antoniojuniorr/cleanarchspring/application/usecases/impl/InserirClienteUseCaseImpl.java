package io.github.antoniojuniorr.cleanarchspring.application.usecases.impl;

import io.github.antoniojuniorr.cleanarchspring.application.gateways.ClienteGateway;
import io.github.antoniojuniorr.cleanarchspring.application.usecases.InserirClienteUseCase;
import io.github.antoniojuniorr.cleanarchspring.domain.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class InserirClienteUseCaseImpl implements InserirClienteUseCase {

    private final ClienteGateway clienteGateway;

    public InserirClienteUseCaseImpl(ClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    @Override
    public void inserir(Cliente cliente) {
        clienteGateway.inserir(cliente);
    }
}
