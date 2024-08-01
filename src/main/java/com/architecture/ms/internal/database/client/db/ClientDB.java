package com.architecture.ms.internal.database.client.db;

import com.architecture.ms.internal.database.RepositoryInterface;
import com.architecture.ms.internal.database.client.model.ClientModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientDB extends RepositoryInterface<ClientModel, Long> {

    Optional<ClientModel> findByUuid(String uuid);
}
