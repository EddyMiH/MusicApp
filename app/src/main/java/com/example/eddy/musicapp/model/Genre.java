package com.example.eddy.musicapp.model;

public class Genre {
    private String name;
    private Integer imageResource;
    private boolean isChecked;

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public Genre() {
    }

    public Genre(String name, Integer imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public Integer getImageResource() {
        return imageResource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageResource(Integer imageResource) {
        this.imageResource = imageResource;
    }
}
