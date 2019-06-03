package com.msproject.myhome.thirdteenager.CustomObject;

import java.util.ArrayList;

public class Bucket {
    private String name;
    private String imgURL;
    private String description;
    private boolean isComplete;
    private ArrayList<String> myPicture;

    public Bucket(String name, String imgURL, String description) {
        this.name = name;
        this.imgURL = imgURL;
        this.description = description;
        this.myPicture = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public void addMyPicture(String imgURL){
        this.myPicture.add(imgURL);
    }
    public ArrayList<String> getMyPicture(){
        return this.myPicture;
    }
}
