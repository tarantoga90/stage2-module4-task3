package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    private FilteringStrategy filteringStrategy;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public void setFilteringStrategy(FilteringStrategy filteringStrategy) {
        this.filteringStrategy = filteringStrategy;
    }

    public List<Product> executeFilteringStrategy() {
        List<Product> resultList = new ArrayList<>();

        for (Product product : this.productList) {
            if (filteringStrategy.filter(product)) {
                resultList.add(product);
            }
        }

        return resultList;
    }
}
