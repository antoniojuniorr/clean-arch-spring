package io.github.antoniojuniorr.cleanarchspring.infra.controllers;

import io.github.antoniojuniorr.cleanarchspring.application.usecases.InserirClienteUseCase;
import io.github.antoniojuniorr.cleanarchspring.infra.controllers.mapper.ClienteMapper;
import io.github.antoniojuniorr.cleanarchspring.infra.controllers.request.ClienteInserirRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/clientes")
public class ClienteController {

    private final InserirClienteUseCase inserirClienteUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> inserir(@Valid @RequestBody ClienteInserirRequest clienteInserirRequest) {
        var cliente = ClienteMapper.toClienteModel(clienteInserirRequest);
        inserirClienteUseCase.inserir(cliente);
        return ResponseEntity.ok().build();
    }
}
