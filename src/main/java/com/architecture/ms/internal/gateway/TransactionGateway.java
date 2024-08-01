package com.architecture.ms.internal.gateway;

import com.architecture.ms.internal.entity.Account;
import com.architecture.ms.internal.entity.Transaction;

public interface TransactionGateway {
    Transaction create(Transaction transaction);
}
