package com.aeryilmaz.accountservice.api;

import com.aeryilmaz.accountservice.entity.Account;
import com.aeryilmaz.accountservice.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountApi {

    @Autowired
    private IAccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Account> update(@RequestBody Account account, @PathVariable String id){
        return ResponseEntity.ok(accountService.update(id,account));
    }
    @DeleteMapping
    public void delete(String id){
        accountService.delete(id);
        ResponseEntity.noContent();
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<List<Account>> getAll(){
        return ResponseEntity.ok(accountService.getAll());
    }

}
