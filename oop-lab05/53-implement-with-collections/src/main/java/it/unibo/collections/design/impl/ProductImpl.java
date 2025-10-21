package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {
    private String name;
    private double quantity;

    public ProductImpl(String name, int quantity) {
        setName(name);
        setQuantity(quantity);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    } 


    @Override
    public double getQuantity() {
        return quantity;
    }

    private void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        Product p2 = (Product)obj;
        return p2.getName().equals(getName());
    }

}
