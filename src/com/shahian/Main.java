package com.shahian;

import java.awt.desktop.SystemEventListener;
import java.sql.Timestamp;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        optionalOrElse();
        optionalEmpty();
        optionalNewObject();
        optionalNullable();
        optionalFilter();
        optionalMap();


    }

    private static void optionalMap() {
        Optional<Integer> integer=Optional.of(30);
        System.out.println("optional Map : " + integer.map(i -> i * 2).get());
    }

    private static void optionalFilter() {
        Optional<Product> optionalProduct = Optional.of(new Product(1L, "book", new Timestamp(System.currentTimeMillis())));
        System.out.println("filter Optional :" + optionalProduct
                .filter(x -> x.getName().startsWith("n"))
                .orElse(new Product(33L, "eraser", new Timestamp(System.currentTimeMillis()))));
    }

    private static void optionalNullable() {
        Product product1 = null;
        Optional<Product> optionalProduct1 = Optional.ofNullable(product1);
        System.out.println("null optional :" + optionalProduct1.isPresent());
    }

    private static void optionalNewObject() {
        Optional<Product> optionalProduct = Optional.of(new Product(1L, "book", new Timestamp(System.currentTimeMillis())));
        System.out.println("book Optional :" + optionalProduct.isPresent());
    }

    private static void optionalEmpty() {
        Optional<Product> product = Optional.empty();
        System.out.println("empty Optional :" + product.isPresent());


    }

    private static void optionalOrElse() {
        Product product1 = null;
        Optional<Product> optionalProduct1 = Optional.ofNullable(product1);
        System.out.println("orElse Optional :" + optionalProduct1.orElse(new Product(2L, "pen", new Timestamp(System.currentTimeMillis()))));
        System.out.println("orElseGet Optional :" + optionalProduct1.orElseGet(() -> new Product(3L, "pencil", new Timestamp(System.currentTimeMillis()))));
        //System.out.println("orElseThrow Optional :" + optionalProduct1.orElseThrow(() -> new NullPointerException("no value!!!!!")));


    }
}
