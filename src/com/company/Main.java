package com.company;
import java.util.ArrayList; // list kitaphanasin kostik

public class Main {

    public static void main(String[] args) {
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(new Cat()); // zhanuardin ishine cat kostik

        animals.get(0).voice();
        animals.get(0).eat();
        animals.get(0).walk();
        animals.get(0).sitDown();

// dauis, tamak,zhuru funk iske asiru
    }
}
