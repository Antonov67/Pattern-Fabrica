package com.company;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Prepering " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (String topping: toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting pizza");
    }

    public String getName() {
        return name;
    }

    void box(){
        System.out.println("Place pizza in official box");
    }
}
