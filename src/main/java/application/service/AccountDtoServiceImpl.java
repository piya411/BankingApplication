package application.service;

import application.model.Account;
import application.model.AccountTransaction;
import application.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AccountDtoServiceImpl implements AccountDtoService {

    @Autowired
    AccountRepository accountRepository;

    /**
     * Gets the list of account details
     * @return
     */
    @Override
    public List<Account> getAccountList() {
        List<Account> accountList = accountRepository.findAllAccounts();
        if(accountList!=null && !CollectionUtils.isEmpty(accountList)) {
            return accountList;
        }
        return new ArrayList<>();
    }

    /**
     * Fetches the list of transactions for an account
     * @param accountId
     * @return
     */
    @Override
    public List<AccountTransaction> getTransactionsByAccId(String accountId) {
        List<AccountTransaction> transactionList=accountRepository.findTransactionsByAccNumber(accountId);
        if(transactionList!=null && !CollectionUtils.isEmpty(transactionList)) {
            return transactionList;
        }
        return new ArrayList<>();
    }
}
