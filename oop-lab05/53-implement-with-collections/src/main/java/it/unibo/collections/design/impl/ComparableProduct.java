package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

    public ComparableProduct(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public int compareTo(Product arg0) {
        int nameComparison = this.getName().compareTo(arg0.getName());
        return nameComparison == 0 ? 
            Double.compare(getQuantity(), arg0.getQuantity()) : 
            nameComparison;
    }

}
