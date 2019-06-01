package application.repository;


import application.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class AccountMapper implements RowMapper<Account> {

    /**
     * Maps the result set to Account object
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account(String.valueOf(rs.getInt("acc_no")),
                rs.getString("acc_name"),
                rs.getString("acc_type"),
                String.valueOf(rs.getDate("bal_date")),
                rs.getString("currency"),
                rs.getBigDecimal("avail_bal"));
        return account;
    }

}
