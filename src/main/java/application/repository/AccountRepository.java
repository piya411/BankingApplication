package application.repository;

import application.model.Account;
import application.model.AccountTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**Find all the accounts
     * @return
     */
    public List<Account> findAllAccounts() {
        return jdbcTemplate.query("select * from Account", new AccountMapper());
    }


    /**Find transactions for an accNo
     * @param accNo
     * @return
     */
    public List<AccountTransaction> findTransactionsByAccNumber(String accNo){
        return jdbcTemplate.query("select * from Transactions where acc_no=?", new Object[] {
                accNo
        }, new AccountTransactionMapper());
    }
}
