/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrgPackage;

import Business.Organization;
import Business.Organization.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferrari
 */
public class OrganizationDirectory implements OrganizationFactory{
    
    private List<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
    
    @Override
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.Journalist.getValue())){
            organization = new JournalistOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Editor.getValue())){
            organization = new EditorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Director.getValue())){
            organization = new DirectorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DataAnalyst.getValue())){
            organization = new DataAnalystOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Publisher.getValue())){
            organization = new PublisherOrganization(name);
            organizationList.add(organization);
        }
        
        return organization;
    }
}
