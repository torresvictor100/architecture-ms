package com.architecture.ms.internal.usecase.create_cliente.dtos;

import java.time.LocalDateTime;

public record CreateClientOutputDTO(String uuid, String name, String email
        , LocalDateTime createAt, LocalDateTime updateAt){}