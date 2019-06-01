package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Account Details
 */
public class Account {

    private String accountNo;
    private String accountName;
    private String accountType;
    private String balDate;
    private String currency;
    private BigDecimal availBal;

    public Account(){

    }
    public Account(String accountNo, String accountName, String accountType, String balDate, String currency, BigDecimal availBal) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balDate = balDate;
        this.currency = currency;
        this.availBal = availBal;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBalDate() {
        return balDate;
    }

    public void setBalDate(String balDate) {
        this.balDate = balDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAvailBal() {
        return availBal;
    }

    public void setAvailBal(BigDecimal availBal) {
        this.availBal = availBal;
    }

}
