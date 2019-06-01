package application.repository;

import application.StartApplication;
import application.model.Account;
import application.model.AccountTransaction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= StartApplication.class)
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;


    @Test
    public void testAccounts(){

        List<Account> accList =accountRepository.findAllAccounts();
        Assert.assertEquals(accList.size(),11);
    }

    @Test
    public void testTransactions(){

        List<AccountTransaction> accList =accountRepository.findTransactionsByAccNumber("768759901");
        Assert.assertEquals(accList.size(),8);
    }

    @Test
    public void testTransactionsForAccountWithNoTransactions(){

        List<AccountTransaction> accList =accountRepository.findTransactionsByAccNumber("123");
        Assert.assertEquals(accList.size(),0);
    }

}
