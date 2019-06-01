package application.repository;

import application.model.AccountTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountTransactionMapper  implements RowMapper<AccountTransaction>{

        /**
         * Maps the result list to Transactions
         * @param rs
         * @param rowNum
         * @return
         * @throws SQLException
         */
        @Override
        public AccountTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {
        AccountTransaction transaction = new AccountTransaction(
                rs.getString("acc_no"),
                rs.getString("acc_name"),
                rs.getString("value_date"),
                rs.getString("currency"),
                rs.getBigDecimal("debit_amount"),
                rs.getBigDecimal("credit_amount"),
                rs.getString("transaction_type"),
                rs.getString("transaction_narrative"));
        return transaction;
    }
}
