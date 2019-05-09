/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.OrgPackage.OrganizationDirectory;

/**
 *
 * @author sheldon
 */
public abstract class ManagementEnterprise extends Organization{
    private ManagementEnterpriseType managementEnterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum ManagementEnterpriseType{
        Strategy("Strategy"),
        Press("Press");
        
        private String value;
        
        private ManagementEnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public ManagementEnterpriseType getManagementEnterpriseType() {
        return managementEnterpriseType;
    }

    public void setManagementEnterpriseType(ManagementEnterpriseType managementEnterpriseType) {
        this.managementEnterpriseType = managementEnterpriseType;
    }

    
    public ManagementEnterprise(String name,ManagementEnterpriseType type){
        super(name);
        this.managementEnterpriseType = type;
        organizationDirectory=new OrganizationDirectory();
    }
    
    
}
