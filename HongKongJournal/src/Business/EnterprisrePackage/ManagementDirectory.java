/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterprisrePackage;

import Business.ManagementEnterprise;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sheldon
 */
public class ManagementDirectory implements ManagementEnterpriseFactory{
    private List<ManagementEnterprise> enterpriseList;//Both save Regional and Board
   
    public List<ManagementEnterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<ManagementEnterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public ManagementDirectory(){
        enterpriseList=new ArrayList<>();
    }
    
    //Create enterprise
    @Override
    public ManagementEnterprise createAndAddEnterprise(String name,ManagementEnterprise.ManagementEnterpriseType type){
        ManagementEnterprise enterprise=null;
        if(type == ManagementEnterprise.ManagementEnterpriseType.Strategy){
            enterprise=new StrategyDepartment(name);
            enterpriseList.add(enterprise);
        }
        if(type == ManagementEnterprise.ManagementEnterpriseType.Press){
            enterprise=new PressDepartment(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
