/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrgPackage;

import Business.Organization;
import Business.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferrari
 */
public class LayoutDesignerOrganization extends Organization {
    
    public LayoutDesignerOrganization(String name) {
        super(Organization.Type.LayoutDesigner.getValue(), name);
    }

    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList();
        //not applied yet //roles.add(new LayoutDesignerRole());
        return roles;
    }
    
}
