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
public class EDWork extends Work {
    private JEWork jeWork;
    private String reportTitle;
    private String reportContent;
    private String editorialTitle;
    private String editorialContent;

    public JEWork getJeWork() {
        return jeWork;
    }

    public void setJeWork(JEWork jeWork) {
        this.jeWork = jeWork;
    }

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

    public String getEditorialContent() {
        return editorialContent;
    }

    public void setEditorialContent(String editorialContent) {
        this.editorialContent = editorialContent;
    }

    @Override
    public String toString() {
        return reportTitle;
    }
    
}
