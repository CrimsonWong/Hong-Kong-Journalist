/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterprisrePackage;

import Business.ManagementEnterprise;

/**
 *
 * @author ferrari
 */
public interface ManagementEnterpriseFactory {
    
    ManagementEnterprise createAndAddEnterprise(String name,ManagementEnterprise.ManagementEnterpriseType type);
    
}
