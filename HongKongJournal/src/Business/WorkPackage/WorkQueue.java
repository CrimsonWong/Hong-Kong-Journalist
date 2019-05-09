/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkPackage;

import Business.Work;
import java.util.ArrayList;

/**
 *
 * @author ferrari
 */
public class WorkQueue {
    
    private ArrayList<Work> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<Work> getWorkRequestList() {
        return workRequestList;
    }
    
}
