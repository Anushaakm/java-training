package com.anu.rest.util;


import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.anu.rest.domain.BankAccount;
import com.anu.rest.dto.BankAccountDto;

@Component
public class DmDtConverter {
    
    public BankAccount toDomain(BankAccountDto dto) {
        return new BankAccount(dto.getId(), dto.getOnwer(), dto.getBalance(), LocalDate.now());
    }

    public BankAccountDto toDto(BankAccount domain) {
        return new BankAccountDto(domain.getId(), domain.getOnwer(), domain.getBalance());
    }
}