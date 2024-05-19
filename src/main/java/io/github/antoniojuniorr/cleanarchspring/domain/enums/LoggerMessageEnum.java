package io.github.antoniojuniorr.cleanarchspring.domain.enums;

import lombok.Getter;

@Getter
public enum LoggerMessageEnum {
    CPF_INVALIDO("1", "Cpf está invalido");

    LoggerMessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private final String code;
    private final String message;
}
