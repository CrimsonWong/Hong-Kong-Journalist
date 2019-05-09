/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NewsGroupPackage;

import Business.AccountPackage.Account;
import Business.EmployeePackage.Employee;
import Business.NetworkPackage.Network;
import Business.Organization;
import Business.Role;
import Business.RolePackage.SystemAdminRole;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wuyan
 */
public class NewsGroup extends Organization{ 
    private static NewsGroup business;
    private List<Network> networkList;
    public synchronized static NewsGroup getInstance(){
        if(business==null){
            business=new NewsGroup();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public List<Role> getSupportedRole() {
        List<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private NewsGroup(){
        super(null);
        networkList=new ArrayList<>();
    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        return this.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
    }
    
    public static NewsGroup configure(){
        
        NewsGroup system = NewsGroup.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        Account ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "1", employee, new SystemAdminRole(),"");
        
        return system;
    }
    
    
}
