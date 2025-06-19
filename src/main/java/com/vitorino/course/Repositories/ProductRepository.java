package com.vitorino.course.Repositories;

import com.vitorino.course.entities.Category;
import com.vitorino.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}