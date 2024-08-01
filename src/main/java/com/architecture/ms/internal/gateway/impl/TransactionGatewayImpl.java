package com.architecture.ms.internal.gateway.impl;

import com.architecture.ms.internal.database.transaction.db.TransctionDB;
import com.architecture.ms.internal.database.transaction.model.TransactionModel;
import com.architecture.ms.internal.entity.Transaction;
import com.architecture.ms.internal.gateway.TransactionGateway;
import org.springframework.stereotype.Service;

import static com.architecture.ms.internal.entity.factory.TransactionFactory.createTransaction;
import static com.architecture.ms.internal.entity.factory.TransactionFactory.createTransactionModel;

@Service
public class TransactionGatewayImpl implements TransactionGateway {
    private TransctionDB transctionDB;
    @Override
    public Transaction create(Transaction transaction) {
        TransactionModel transactionModel = transctionDB.save(createTransactionModel(transaction));
        return createTransaction(transactionModel);
    }
}
