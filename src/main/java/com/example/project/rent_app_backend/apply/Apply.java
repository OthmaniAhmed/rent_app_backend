package com.example.project.rent_app_backend.apply;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "applys")
public class Apply {

    @Id
    private String id ;
    private String tenantName;
    private String phoneNumber;
    private String tenantEmail;
    private String tenantAddress;
    private String tenantGender;
    private String tenantMaritalStatus;
    private String tenantOccupationStatus;
    private String comment;
    private String creatorId;

    public Apply(String id, String tenantName, String phoneNumber, String tenantEmail, String tenantAddress, String tenantGender, String tenantMaritalStatus, String tenantOccupationStatus, String comment, String creatorId) {
        this.id = id;
        this.tenantName = tenantName;
        this.phoneNumber = phoneNumber;
        this.tenantEmail = tenantEmail;
        this.tenantAddress = tenantAddress;
        this.tenantGender = tenantGender;
        this.tenantMaritalStatus = tenantMaritalStatus;
        this.tenantOccupationStatus = tenantOccupationStatus;
        this.comment = comment;
        this.creatorId = creatorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }

    public String getTenantAddress() {
        return tenantAddress;
    }

    public void setTenantAddress(String tenantAddress) {
        this.tenantAddress = tenantAddress;
    }

    public String getTenantGender() {
        return tenantGender;
    }

    public void setTenantGender(String tenantGender) {
        this.tenantGender = tenantGender;
    }

    public String getTenantMaritalStatus() {
        return tenantMaritalStatus;
    }

    public void setTenantMaritalStatus(String tenantMaritalStatus) {
        this.tenantMaritalStatus = tenantMaritalStatus;
    }

    public String getTenantOccupationStatus() {
        return tenantOccupationStatus;
    }

    public void setTenantOccupationStatus(String tenantOccupationStatus) {
        this.tenantOccupationStatus = tenantOccupationStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
