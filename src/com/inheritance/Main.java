package com.inheritance;

public class Main {
    public static void main(String[] args) {

        Car mbw = new Car(250, 3000, "Blue", new byte[]{0, 0, 0});
        Truck niva = new Truck(2500, new byte[]{3, 2, 0}, true);

        System.out.println(niva.getValues());
    }
}