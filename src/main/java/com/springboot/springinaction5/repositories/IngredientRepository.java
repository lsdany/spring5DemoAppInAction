package com.springboot.springinaction5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springinaction5.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{

}
