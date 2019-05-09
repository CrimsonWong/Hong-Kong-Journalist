/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrgPackage;

import Business.Organization;
import Business.Role;
import Business.RolePackage.AdminRole;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferrari
 */
public class AdminOrganization extends Organization {
    
    public AdminOrganization(String name) {
        super(Type.Admin.getValue(), name);
    }
    
    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}
