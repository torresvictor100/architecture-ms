package com.architecture.ms.internal.usecase.create_transation.dtos;

public record CreateTransactionInputDTO(Long id,String accountUuidFrom
        , String accountUuidTo, Integer amouth) {
}
