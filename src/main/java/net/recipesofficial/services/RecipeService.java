package net.recipesofficial.services;

import net.recipesofficial.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
