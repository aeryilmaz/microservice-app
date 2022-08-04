package com.aeryilmaz.accountservice.repository;

import com.aeryilmaz.accountservice.entity.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends CassandraRepository<Account,String> {
}
