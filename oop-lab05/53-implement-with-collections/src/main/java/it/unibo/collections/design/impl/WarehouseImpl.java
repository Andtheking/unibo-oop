package it.unibo.collections.design.impl;

import java.util.Set;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse {
    private LinkedHashSet<Product> products;

    public WarehouseImpl() {
        products = new LinkedHashSet<>();
    }

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public Set<String> allNames() {
        Set<String> names = new LinkedHashSet<>();
        for (Product product : products) {
            names.add(product.getName());
        }
        return names;
    }

    @Override
    public Set<Product> allProducts() {
        return new LinkedHashSet<>(this.products);
    }

    @Override
    public boolean containsProduct(Product p) {
        return products.contains(p);
    }

    @Override
    public double getQuantity(String name) {
        for (Product product : products) {
            if (product.getName() == name) {
                return product.getQuantity();
            }
        }
        return -1;
    }

}
