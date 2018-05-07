package org.vaai.bank.data.domain;

import org.vaai.bank.enums.AccountType;

import java.math.BigDecimal;

public class Account {

    private Long accountId;

    private Long userId;

    private BigDecimal balance = new BigDecimal(0);

    private AccountType type;


    /**
     * Adds Money
     * @param money money to be subtracted
     */
    public void addMoney(Double money){
        this.balance.add(new BigDecimal(money));
    }


    /**
     * Subtract Money
     * @param money money to be subtracted
     */
    public void withdrawMoney(Double money){
        this.balance.subtract(new BigDecimal(money));
    }


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("accountId=").append(accountId);
        sb.append(", userId=").append(userId);
        sb.append(", balance=").append(balance);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
