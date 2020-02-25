package AssJava5.Repository;

import AssJava5.Model.Products;

import java.util.List;

public interface ProductsRepository extends Repository<Products>{
    Products findByName(String name);
    List<Products> findByNameSession(String name);
    void refresh(Products products);
}
