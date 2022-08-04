package com.aeryilmaz.accountservice.service;

import com.aeryilmaz.accountservice.entity.Account;

import java.util.List;

public interface IAccountService {
    public Account get(String id);
    public Account save(Account account);
    public Account update(String id,Account account);
    public List<Account> getAll();
    public void delete(String id);
}
