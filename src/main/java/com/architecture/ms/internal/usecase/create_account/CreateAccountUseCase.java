package com.architecture.ms.internal.usecase.create_account;

import com.architecture.ms.internal.gateway.AccountGateway;
import com.architecture.ms.internal.gateway.ClientGateway;
import com.architecture.ms.internal.entity.Account;
import com.architecture.ms.internal.entity.Client;
import com.architecture.ms.internal.usecase.create_account.dtos.CreateAccountInputDTO;
import com.architecture.ms.internal.usecase.create_account.dtos.CreateAccountOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.architecture.ms.internal.usecase.create_account.factory.CreateAccountDTOs.createAccountOutputFactory;

@Service
public class CreateAccountUseCase {

    @Autowired
    private AccountGateway accountGateway;
    @Autowired
    private ClientGateway clientGateway;

    public CreateAccountUseCase(AccountGateway accountGateway, ClientGateway clientGateway) {
        this.accountGateway = accountGateway;
        this.clientGateway = clientGateway;
    }

    public CreateAccountOutputDTO executed(CreateAccountInputDTO accountInput) {
        Client client = clientGateway.get(accountInput.clientUuid());
        Account account = new Account().newAccount(client);
        account = accountGateway.save(account);
        return createAccountOutputFactory(account);
    }
}
