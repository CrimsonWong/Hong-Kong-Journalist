/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AccountPackage;

import Business.EmployeePackage.Employee;
import Business.Role;
import java.util.ArrayList;

/**
 *
 * @author ferrari
 */
public class AccountDirectory implements AccountFactory{
    
    private ArrayList<Account> accountList;

    public AccountDirectory() {
        accountList = new ArrayList();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }
    
    public Account authenticateUser(String username, String password){
        for (Account ua : accountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    @Override
    public Account createUserAccount(String username, String password, Employee employee, Role role, String picture){
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setEmployee(employee);
        account.setRole(role);
        account.setPicture(picture);
        accountList.add(account);
        return account;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        return accountList.stream().noneMatch((ua) -> (ua.getUsername().equals(username)));
    }
    
}
