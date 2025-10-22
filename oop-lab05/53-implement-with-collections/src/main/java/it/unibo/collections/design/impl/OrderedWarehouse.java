package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

import java.util.Set;
import java.util.TreeSet;

public class OrderedWarehouse extends WarehouseImpl {

    @Override
    public Set<Product> allProducts() {
        return new TreeSet<Product>(super.allProducts());
    }
}
