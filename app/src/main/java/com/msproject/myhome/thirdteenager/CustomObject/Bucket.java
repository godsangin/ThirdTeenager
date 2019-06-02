package com.msproject.myhome.thirdteenager.CustomObject;

public class Bucket {
    private String name;
    private String imgURL;
    private String description;

    public Bucket(String name, String imgURL, String description) {
        this.name = name;
        this.imgURL = imgURL;
        this.description = description;
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
}
