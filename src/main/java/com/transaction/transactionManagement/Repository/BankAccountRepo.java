package com.transaction.transactionManagement.Repository;

import com.transaction.transactionManagement.entity.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BankAccountRepo extends CrudRepository<BankAccount,Integer> {
    public BankAccount findByLastName(String name);
}
