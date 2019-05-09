/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.AccountPackage.Account;
import Business.NewsGroupPackage.NewsGroup;
import javax.swing.JPanel;

/**
 *
 * @author ferrari
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"), 
        //Board("")
        Journalist("Journalist"),
        Editor("Editor"), //News
        Director("Director"),
        DataAnalyst("DataAnalyst"), 
        LayoutDesigner("LayoutDesigner"), //Strategy, One
        Publisher("Publisher"); //Press
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    //RegionalNews
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Account account, 
            Organization organization, 
            RegionalNewsEnterprise newsenterprise,
            NewsGroup business
            );
    //Management
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Account account, 
            Organization organization, 
            ManagementEnterprise boardEnterprise,
            NewsGroup business
            );

    @Override
    public String toString() {
        String s = this.getClass().getName();
        String result[] = s.split("\\.", 3);
        return result[2];
    }
    
}
