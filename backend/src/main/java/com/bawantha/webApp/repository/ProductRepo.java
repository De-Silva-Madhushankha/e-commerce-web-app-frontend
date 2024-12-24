package com.bawantha.webApp.repository;

import com.bawantha.webApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//primary key type - Integer
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {



}
