package com.architecture.ms.internal.database.transaction.db;

import com.architecture.ms.internal.database.RepositoryInterface;
import com.architecture.ms.internal.database.transaction.model.TransactionModel;
import jakarta.persistence.Table;

import java.util.Optional;

@Table(name = "transction")
public interface TransctionDB extends RepositoryInterface<TransactionModel, Long> {
    Optional<TransactionModel> findByUuid(String uuid);
}
