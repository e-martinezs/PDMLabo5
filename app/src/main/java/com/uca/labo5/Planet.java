package com.uca.labo5;

/**
 * Created by uca on 04-16-18.
 */

public class Planet {

    private int id;
    private String name;
    private String description;
    private boolean favorite = false;
    private int imageID;

    public Planet(int id, String name, String description, int imageID){
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
