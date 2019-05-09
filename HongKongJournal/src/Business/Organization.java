/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EmployeePackage.EmployeeDirectory;
import Business.AccountPackage.AccountDirectory;
import Business.WorkPackage.WorkQueue;
import java.util.List;

/**
 *
 * @author ferrari
 */
public abstract class Organization {
    
    private String name;
    private String type;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private AccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    
    public enum Type{
        Admin("Admin Organization"), 
        Journalist("Journalist Department"),
        Editor("Editor Department"), //News
        Director("Director Department"),
        DataAnalyst("DataAnalyst Department"), 
        LayoutDesigner("LayoutDesigner Department"), //Strategy, One
        Publisher("Publisher Department"); //Press
        
        private String value;
        private Type(String value) {
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

    public Organization(String type, String name) {
        this.type = type;
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new AccountDirectory();
        organizationID = counter; //disable id in any tables
        ++counter;
    }
    
    public Organization(String name) {
        //this.type = type;
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new AccountDirectory();
        organizationID = counter; //disable id in any tables
        ++counter;
    }

    public abstract List<Role> getSupportedRole();
    
    public AccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
//        String s = this.getClass().getName();
//        String result[] = s.split("\\.", 3);
//        return result[2];
        return name;
        
    }
    
}
