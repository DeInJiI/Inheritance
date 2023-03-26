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
    }

    @Override
    protected String getValues(){
        System.out.println(super.getValues());
        return getLoaded();
    }
    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded (){
        if (isLoaded)
            return "Грузовик загружен";
        else
           return  "Грузовик пустой";
    }
}
