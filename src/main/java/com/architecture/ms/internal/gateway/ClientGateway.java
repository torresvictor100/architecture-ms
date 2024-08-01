package com.architecture.ms.internal.gateway;

import com.architecture.ms.internal.entity.Client;

public interface ClientGateway {
    Client get(String uuid);
    Client save(Client client);
}
