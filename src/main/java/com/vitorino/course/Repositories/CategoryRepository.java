package com.vitorino.course.Repositories;

import com.vitorino.course.entities.Category;
import com.vitorino.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}