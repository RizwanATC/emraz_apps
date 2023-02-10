package com.example.emraz_apps;

public class MyModel {
    String tittle,description,date;
    int image;
    public MyModel(String tittle,String description,String date,int image){
        this.tittle = tittle;
        this.description= description;
        this.date = date;
        this.image= image;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
