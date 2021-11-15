package com.company;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) return new NYStyleCheesePizza();
        else return null;
    }
}
