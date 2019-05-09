/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkPackage;

import Business.Work;

/**
 *
 * @author ferrari
 */
public class DDWork extends Work{
    private EDWork edWork;
    private int likes;
    private String reportTitle;
    private String editorialTitle;
    
    public EDWork getEdWork() {
        return edWork;
    }

    public void setEdWork(EDWork edWork) {
        this.edWork = edWork;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
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
