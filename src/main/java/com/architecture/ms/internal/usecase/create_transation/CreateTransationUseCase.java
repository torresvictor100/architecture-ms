package com.architecture.ms.internal.usecase.create_transation;

import com.architecture.ms.internal.gateway.AccountGateway;
import com.architecture.ms.internal.gateway.TransactionGateway;
import com.architecture.ms.internal.entity.Account;
import com.architecture.ms.internal.entity.Transaction;
import com.architecture.ms.internal.usecase.create_transation.dtos.CreateTransactionInputDTO;
import com.architecture.ms.internal.usecase.create_transation.dtos.CreateTransationOutputDTO;
import com.architecture.ms.internal.usecase.create_transation.factory.CreateTransationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTransationUseCase {
    @Autowired
    private AccountGateway accountGateway;
    @Autowired
    private TransactionGateway transactionGateway;

    public CreateTransationUseCase(AccountGateway accountGateway, TransactionGateway transactionGateway) {
        this.accountGateway = accountGateway;
        this.transactionGateway = transactionGateway;
    }

    public CreateTransationOutputDTO executed(CreateTransactionInputDTO transactionInput){
        Account accountIDFrom = accountGateway.get(transactionInput.accountUuidFrom());
        Account accountIDTo =accountGateway.get(transactionInput.accountUuidFrom());
        Transaction transaction = new Transaction().newTransaction(accountIDFrom
                , accountIDTo, transactionInput.amouth());

        transaction =  transactionGateway.create(transaction);
        return CreateTransationFactory.createTransationOutput(transaction);
    }
}
