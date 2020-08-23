package guru.springframework.spring5mongorecipeapp.repositories;

import guru.springframework.spring5mongorecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
