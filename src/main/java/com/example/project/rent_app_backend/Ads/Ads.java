package com.example.project.rent_app_backend.Ads;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;


@Document(collection = "ads")
public class Ads {
    @Id
    private String id ;
    private String  adress ;
    @NotNull(message = "ville is required")
    private String  ville;
    private float  prix;
    private String  prixBy;
    private int  roomNumber;
    private String  tenantType;
    private String picture;
    private String description;
    private String phoneNumber;
    private String email;
    private String creatorId;

    public Ads(){

    }

    public Ads(String id, String adress, String ville, float prix, String prixBy, int roomNumber, String tenantType, String picture, String description, String phoneNumber, String email, String creatorId) {
        this.id = id;
        this.adress = adress;
        this.ville = ville;
        this.prix = prix;
        this.prixBy = prixBy;
        this.roomNumber = roomNumber;
        this.tenantType = tenantType;
        this.picture = picture;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.creatorId = creatorId;
    }



    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Ads(String tenantType) {
        this.tenantType = tenantType;
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
    }

    public String getCreatorId() {

        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getPrixBy() {
        return prixBy;
    }

    public void setPrixBy(String prixBy) {
        this.prixBy = prixBy;
    }


    public String getTenantType() {
        return tenantType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
