/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkPackage;

import Business.Work;

/**
 *
 * @author sheldon
 */
public class JEWork extends Work{
    private String reportTitle;
    private String reportContent;
    private String editorialTitle;
   
    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }
    
    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getEditorialTitle() {
        return editorialTitle;
    }

    public void setEditorialTitle(String editorialTitle) {
        this.editorialTitle = editorialTitle;
    }
    
    @Override
    public String toString() {
        return reportTitle;
    }
    
}
