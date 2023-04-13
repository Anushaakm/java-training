package com.anu.rest.repository;



import java.util.Collection;

import com.anu.rest.domain.BankAccount;

public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
}