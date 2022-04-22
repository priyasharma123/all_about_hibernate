package com.transaction.transactionManagement.service;

import com.transaction.transactionManagement.Repository.BankAccountRepo;
import com.transaction.transactionManagement.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankRepoServiceImpl implements BankRepoService {

    @Autowired
    BankAccountRepo bankAccountRepo;

    @Override
    public void  transfer(int amount) {
        BankAccount bankAccount = bankAccountRepo.findById(1).get();
        System.out.println(bankAccount);
        bankAccount.setBal(bankAccount.getBal()-amount);
        bankAccountRepo.save(bankAccount);
        if(true) throw new RuntimeException();
        BankAccount bankAccount1 = bankAccountRepo.findById(2).get();
        bankAccount1.setBal(bankAccount1.getBal()+amount);
        bankAccountRepo.save(bankAccount1);


    }
}
