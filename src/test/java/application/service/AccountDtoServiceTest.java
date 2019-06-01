package application.service;

import application.model.Account;
import application.model.AccountTransaction;
import application.repository.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AccountDtoServiceTest {

    @InjectMocks
    AccountDtoServiceImpl dtoService;

    @Mock
    AccountRepository repository;

    @Test
    public void testGetAccountsWithEmptyList(){
       Mockito.when(repository.findAllAccounts()).thenReturn(null);
       List<Account> result = dtoService.getAccountList();
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAccounts(){
        List<Account> accountList = setAccountList();
        Mockito.when(repository.findAllAccounts()).thenReturn(accountList);
        List<Account> result = dtoService.getAccountList();
        Assert.assertTrue(!result.isEmpty());
        Assert.assertEquals(result.size(),2);
        Assert.assertEquals(result.get(0).getAccountName(),"account 1");
        Assert.assertEquals(result.get(1).getAccountType(),"current");
    }

    public List<Account> setAccountList(){
        List<Account> accountList = new ArrayList<>();
        Account account1 = new Account("1","account 1","savings","1/1/2018","AUD", new BigDecimal(100));
        Account account2 = new Account("2","account 2","current","1/1/2018","SGD", new BigDecimal(211));
        accountList.add(account1);
        accountList.add(account2);
        return  accountList;
    }

    @Test
    public void testGetTransactionsWithEmptyList(){
        Mockito.when(repository.findTransactionsByAccNumber(ArgumentMatchers.any(String.class))).thenReturn(null);
        List<AccountTransaction> result = dtoService.getTransactionsByAccId("11");
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGetTransactions(){
        List<AccountTransaction> transactionList = setTransactionList();
        Mockito.when(repository.findTransactionsByAccNumber(ArgumentMatchers.any(String.class))).thenReturn(transactionList);
        List<AccountTransaction> result = dtoService.getTransactionsByAccId("123");
        Assert.assertTrue(!result.isEmpty());
        Assert.assertEquals(result.size(),2);
        Assert.assertEquals(result.get(0).getAccountName(),"account 1");
        Assert.assertEquals(result.get(1).getTransactionType(),"credit");
    }

    public List<AccountTransaction> setTransactionList(){
        List<AccountTransaction> transactionList = new ArrayList<>();
        AccountTransaction tr1 = new AccountTransaction("1","account 1","1/1/2018","AUD", new BigDecimal(100),null,"Debit","");
        AccountTransaction tr2 = new AccountTransaction("2","account 2","1/1/2018","SGD", null, new BigDecimal(123.67),"credit","");
        transactionList.add(tr1);
        transactionList.add(tr2);
        return  transactionList;
    }


}
