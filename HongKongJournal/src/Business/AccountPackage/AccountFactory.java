/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AccountPackage;

import Business.EmployeePackage.Employee;
import Business.Role;

/**
 *
 * @author ferrari
 */
public interface AccountFactory {
    
    Account createUserAccount(String username, String password, Employee employee, Role role, String picture);

}
