package com.architecture.ms.internal.database.account.db;

import com.architecture.ms.internal.database.RepositoryInterface;
import com.architecture.ms.internal.database.account.model.AccountModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountDB extends RepositoryInterface<AccountModel, Long> {
    Optional<AccountModel> findByUuid(String uuid);
}
