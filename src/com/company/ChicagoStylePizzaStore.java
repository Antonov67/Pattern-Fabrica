package com.company;

public class ChicagoStylePizzaStore extends PizzaStore{
    Pizza pizza=null;
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) return new ChicagoStyleCheesePizza();
        else return null;
    }
}
