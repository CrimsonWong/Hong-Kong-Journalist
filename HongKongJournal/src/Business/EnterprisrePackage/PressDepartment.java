/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterprisrePackage;

import Business.ManagementEnterprise;
import Business.ManagementEnterprise.ManagementEnterpriseType;
import Business.Role;
import java.util.List;

/**
 *
 * @author ferrari
 */
public class PressDepartment extends ManagementEnterprise {
    
    public PressDepartment(String name){
        super(name,ManagementEnterpriseType.Press);
    }
    @Override
    public List<Role> getSupportedRole() {
        return null;
    }
    
}
