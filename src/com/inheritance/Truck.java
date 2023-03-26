package com.inheritance;

public class Truck extends Transport{
    private boolean isLoaded;

    public Truck (int weight, byte[] coordinate) {
        super(weight, coordinate);
        System.out.println(getValues());
    }
    public Truck (int weight, byte[] coordinate,boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
        System.out.println(getValues());
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public void getLoaded (){
        if (isLoaded)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик пустой");
    }
}
