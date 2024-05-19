package io.github.antoniojuniorr.cleanarchspring.domain.enums;

import lombok.Getter;

@Getter
public enum SituacaoCliente {
    ATIVO(1l, "Ativo"),
    INATIVO(2l, "Inativo");

    SituacaoCliente(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    private Long id;
    private String descricao;

    public static SituacaoCliente obterPorDescricao(String descricao) {
        for (SituacaoCliente situacao : SituacaoCliente.values()) {
            if (situacao.getDescricao().equalsIgnoreCase(descricao)) {
                return situacao;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + descricao);
    }
}
