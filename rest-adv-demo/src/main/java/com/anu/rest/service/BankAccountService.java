package com.anu.rest.service;

import java.util.Collection;

import com.anu.rest.dto.BankAccountDto;

public interface BankAccountService {
 
    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();
}