package com.architecture.ms.internal.gateway;

import com.architecture.ms.internal.entity.Account;

public interface AccountGateway {
    Account get(String uuid);
    Account save(Account account);
}
