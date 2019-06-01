package application.service;

import application.model.Account;
import application.model.AccountTransaction;

import java.util.List;

/**
 * Interface to fetch account details
 */
public interface AccountDtoService {

    List<Account> getAccountList();

    List<AccountTransaction> getTransactionsByAccId(String accountId);
}
