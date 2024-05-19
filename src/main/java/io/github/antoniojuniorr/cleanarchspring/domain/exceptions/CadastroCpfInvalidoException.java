package io.github.antoniojuniorr.cleanarchspring.domain.exceptions;

import io.github.antoniojuniorr.cleanarchspring.domain.enums.SituacaoCliente;
import lombok.Data;

@Data
public class CadastroCpfInvalidoException extends RuntimeException {
    private SituacaoCliente situacaoCliente;

    CadastroCpfInvalidoException(SituacaoCliente situacaoCliente, Exception e) {
        super(e);
        this.situacaoCliente = situacaoCliente;
    }
}
