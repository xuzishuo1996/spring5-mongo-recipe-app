package guru.springframework.spring5mongorecipeapp.services;

import guru.springframework.spring5mongorecipeapp.commands.RecipeCommand;
import guru.springframework.spring5mongorecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String l);

    RecipeCommand findCommandById(String l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
