/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RolePackage;

import Business.AccountPackage.Account;
import Business.ManagementEnterprise;
import Business.NewsGroupPackage.NewsGroup;
import Business.OrgPackage.PublisherOrganization;
import Business.Organization;
import Business.RegionalNewsEnterprise;
import Business.Role;
import UserInterface.PublisherRole.PublisherWorkPanel;
import javax.swing.JPanel;

/**
 *
 * @author sheldon
 */
public class PublisherRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, RegionalNewsEnterprise enterprise, NewsGroup business) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, ManagementEnterprise boardEnterprise, NewsGroup business) {
        return new PublisherWorkPanel(userProcessContainer, account, (PublisherOrganization)organization, business);
    }
}
