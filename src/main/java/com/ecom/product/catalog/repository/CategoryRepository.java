package com.ecom.product.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.product.catalog.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
