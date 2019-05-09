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
import UserInterface.ManagementAdmin.ManagementAdminPanel;
import UserInterface.RegionalNewsAdmin.RegionalNewsAdminPanel;
import javax.swing.JPanel;

/**
 *
 * @author ferrari
 */
public class AdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, RegionalNewsEnterprise enterprise, NewsGroup business) {
        return new RegionalNewsAdminPanel(userProcessContainer, enterprise, business);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, ManagementEnterprise boardEnterprise, NewsGroup business) {
        return new ManagementAdminPanel(userProcessContainer, boardEnterprise, business);
    }
    
}
