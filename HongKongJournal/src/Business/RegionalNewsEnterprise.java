/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.OrgPackage.OrganizationDirectory;

/**
 *
 * @author wuyan
 */
public abstract class RegionalNewsEnterprise extends Organization{
    
    private RegionalNewsEnterpriseType regionalEnterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum RegionalNewsEnterpriseType{
        News("News");
        
        private String value;
        
        private RegionalNewsEnterpriseType(String value){
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

    public RegionalNewsEnterpriseType getRegionalNewsEnterpriseType() {
        return regionalEnterpriseType;
    }

    public void setRegionalEnterpriseType(RegionalNewsEnterpriseType regionalEnterpriseType) {
        this.regionalEnterpriseType = regionalEnterpriseType;
    }
    
    public RegionalNewsEnterprise(String name,RegionalNewsEnterpriseType type){
        super(name);
        this.regionalEnterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}
