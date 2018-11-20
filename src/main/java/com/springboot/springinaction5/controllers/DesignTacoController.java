package com.springboot.springinaction5.controllers;

import com.springboot.springinaction5.domain.Ingredient;

import com.springboot.springinaction5.domain.Ingredient.Type;
import com.springboot.springinaction5.domain.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping()
    public String showDesignForm(Model model){

        List<Ingredient> ingredients = new ArrayList<>();
        //ingredientRepo.findAll().forEach(i -> ingredients.add(i));
        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }


        return "design";
    }


    @PostMapping
    public String processTaco(@Valid Taco taco, Errors errors){

        if(errors.hasErrors()){
            return "design";
        }

        return "return \"redirect:/orders/current\";";
    }

    private List<Ingredient> filterByType(
            List<Ingredient> userForces, Ingredient.Type type) {
        return userForces
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
