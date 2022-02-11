package com.guobin.mapper;

import com.guobin.domain.Account;

import java.util.List;

public interface AccountMapper {


    public void save(Account account);


    public List<Account> findAll();
}
