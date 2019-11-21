package net.recipesofficial.repositories;

import net.recipesofficial.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
