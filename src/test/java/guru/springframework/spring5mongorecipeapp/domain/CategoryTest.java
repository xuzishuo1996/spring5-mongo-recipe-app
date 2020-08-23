package guru.springframework.spring5mongorecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)   //execute all test methods on the same test instance
class CategoryTest {

    Category category;


    @BeforeEach
    public void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        String idValue = "4";

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}