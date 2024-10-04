package ru.artemiyandstepan.model;

public class Location {
    private Double x;
    private float y;
    private String name;

    public Location(Double x, float y, String name){

        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
