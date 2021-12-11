package com.example.project.rent_app_backend.Ads;

public class Comments {
    private String commenterName ;
    private String dateOfCreation ;
    private String theComment ;

    public Comments(String commenterName, String dateOfCreation, String theComment) {
        this.commenterName = commenterName;
        this.dateOfCreation = dateOfCreation;
        this.theComment = theComment;
    }

    public Comments() {
    }

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getTheComment() {
        return theComment;
    }

    public void setTheComment(String theComment) {
        this.theComment = theComment;
    }
}
