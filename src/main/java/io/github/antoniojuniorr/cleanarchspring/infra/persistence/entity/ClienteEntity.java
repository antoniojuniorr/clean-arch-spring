package io.github.antoniojuniorr.cleanarchspring.infra.persistence.entity;

import io.github.antoniojuniorr.cleanarchspring.domain.enums.SituacaoCliente;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @Enumerated(EnumType.STRING)
    private SituacaoCliente situacaoCliente;
}
