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
import Business.OrgPackage.JournalistOrganization;
import Business.Organization;
import Business.Role;
import UserInterface.JournalistRole.JournalistWorkPanel;
import javax.swing.JPanel;

/**
 *
 * @author ferrari
 */
public class JournalistRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, RegionalNewsEnterprise enterprise, NewsGroup business) {
        return new JournalistWorkPanel(userProcessContainer, account, (JournalistOrganization)organization, enterprise);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, ManagementEnterprise boardEnterprise, NewsGroup business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
