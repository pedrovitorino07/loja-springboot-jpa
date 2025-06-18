package com.vitorino.course.services;

import com.vitorino.course.Repositories.CategoryRepository;
import com.vitorino.course.Repositories.UserRepository;
import com.vitorino.course.entities.Category;
import com.vitorino.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
