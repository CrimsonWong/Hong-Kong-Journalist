/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkPackage;

import Business.Work;
import java.util.List;

/**
 *
 * @author sheldon
 */
public class DPWork extends Work{
    private static DPWork dpwork;
    private List<DDWork> list;
    
    public synchronized static DPWork getInstance(){
        if(dpwork==null){
            dpwork=new DPWork();
        }
        return dpwork;
    }

    public List<DDWork> getList() {
        return list;
    }

    public void setList(List<DDWork> list) {
        this.list = list;
    }
    
    
}
