package com.architecture.ms.internal.usecase.create_transation.factory;

import com.architecture.ms.internal.entity.Transaction;
import com.architecture.ms.internal.usecase.create_transation.dtos.CreateTransationOutputDTO;

public class CreateTransationFactory {

    public static CreateTransationOutputDTO createTransationOutput(Transaction transaction){
        return new CreateTransationOutputDTO(transaction.getUuid());
    }
}
