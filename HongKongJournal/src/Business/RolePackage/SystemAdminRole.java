/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RolePackage;

import Business.AccountPackage.Account;
import Business.ManagementEnterprise;
import Business.RegionalNewsEnterprise;
import Business.NewsGroupPackage.NewsGroup;
import Business.Organization;
import Business.Role;
import UserInterface.SysAdmin.SysAdminPanel;
import javax.swing.JPanel;

/**
 *
 * @author wuyan
 */
public class SystemAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, RegionalNewsEnterprise enterprise, NewsGroup system) {
        return new SysAdminPanel(userProcessContainer, system);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, ManagementEnterprise boardEnterprise, NewsGroup business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
