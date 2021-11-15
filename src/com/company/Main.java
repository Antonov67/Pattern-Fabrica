package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Pizza: " + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Pizza: " + pizza.getName() + "\n");
    }
}
