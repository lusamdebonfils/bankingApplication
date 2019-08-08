package edu.mum.cs.finalprep.bankingapplication.model;

import javax.persistence.*;

@Entity
@Table(name = "accounttypes")
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountType;
    @Column(nullable = false)
    private String accountTypeName;

    public AccountType() {
        super();
    }

    public AccountType(String accountTypeName) {
        super();
        this.accountTypeName = accountTypeName;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountType=" + accountType +
                ", accountTypeName='" + accountTypeName + '\'' +
                '}';
    }
}
