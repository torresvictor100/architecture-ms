package com.architecture.ms.internal.gateway.impl;

import com.architecture.ms.internal.database.account.db.AccountDB;
import com.architecture.ms.internal.database.account.model.AccountModel;
import com.architecture.ms.internal.entity.Account;
import com.architecture.ms.internal.gateway.AccountGateway;
import com.architecture.ms.internal.gateway.exception.NoFoundAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.architecture.ms.internal.entity.factory.AccountFactory.createAccount;
import static com.architecture.ms.internal.entity.factory.AccountFactory.createAccountModel;

@Service
public class AccountGatewayImpl implements AccountGateway {
    @Autowired
    private AccountDB accountDB;
    @Override
    public Account get(String uuid) {
        AccountModel accountModel = accountDB.findByUuid(uuid).orElseThrow(()
                -> new NoFoundAccountException("Account not found for UUID: " + uuid));
        return createAccount(accountModel);
    }

    @Override
    public Account save(Account account) {
        AccountModel accountModel = accountDB.save(createAccountModel(account));
        return createAccount(accountModel);
    }
}
