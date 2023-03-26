package com.inheritance;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    protected Transport(float speed, int weight, String color, byte[] coordinate) {
        setValues(speed,weight,color,coordinate);
    }

    protected Transport(int weight, byte[] coordinate) {
        setValues(weight,coordinate);
    }

    protected String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color;
        String infoCoordinates = ". Coordinates:\n";
        for (byte b : coordinate) infoCoordinates += b + "\n";
        return info + infoCoordinates;
    }

    protected void setValues(int weight, byte[] coordinate) {
        this.weight= weight;
        this.coordinate= coordinate;
    }

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
}
