/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterprisrePackage;

import Business.RegionalNewsEnterprise;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wuyan
 */
public class RegionalNewsDirectory implements RegionalNewsEnterpriseFactory{
    private List<RegionalNewsEnterprise> enterpriseList;//Both save Regional and Board
   

    public List<RegionalNewsEnterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<RegionalNewsEnterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public RegionalNewsDirectory(){
        enterpriseList=new ArrayList<>();
    }
    
    //Create enterprise
    @Override
    public RegionalNewsEnterprise createAndAddEnterprise(String name,RegionalNewsEnterprise.RegionalNewsEnterpriseType type){
        RegionalNewsEnterprise enterprise=null;
        if(type==RegionalNewsEnterprise.RegionalNewsEnterpriseType.News){
            enterprise=new NewsDepartment(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
