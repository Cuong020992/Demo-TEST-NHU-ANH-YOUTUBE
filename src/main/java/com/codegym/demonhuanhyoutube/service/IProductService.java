package com.codegym.demonhuanhyoutube.service;

import java.util.Optional;

public interface IProductService<Product> {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    Product save (Product product);

    void remove(Long id);

}
