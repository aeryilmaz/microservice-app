package com.aeryilmaz.accountservice.service.impl;

import com.aeryilmaz.accountservice.entity.Account;
import com.aeryilmaz.accountservice.repository.IAccountRepository;
import com.aeryilmaz.accountservice.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account update(String id,Account account) {
        Assert.isNull(id,"Id cannot be null !");
        return accountRepository.save(account);
    }

    @Override
    public void delete(String id) {
        accountRepository.deleteById(id);
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
