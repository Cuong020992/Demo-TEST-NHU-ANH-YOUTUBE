package com.codegym.demonhuanhyoutube.repository;

import com.codegym.demonhuanhyoutube.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

}
