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
import Business.OrgPackage.DataAnalystOrganization;
import Business.Organization;
import Business.Role;
import UserInterface.DataAnalystRole.DataAnalystWorkPanel;
import javax.swing.JPanel;
/**
 *
 * @author wuyan
 */
public class DataAnalystRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, RegionalNewsEnterprise enterprise, NewsGroup business) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, ManagementEnterprise boardEnterprise, NewsGroup business) {
        return new DataAnalystWorkPanel(userProcessContainer, account, (DataAnalystOrganization)organization, business);
    }
}
