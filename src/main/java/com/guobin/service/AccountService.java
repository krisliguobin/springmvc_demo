package com.guobin.service;

import com.guobin.domain.Account;

import java.util.List;

public interface AccountService {


    public void save(Account account);

    public List<Account> findAll();
}
