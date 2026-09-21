package programmer.it.application;

import programmer.it.data.Category;

public class CategoryApp {
    static void main() {
        var category = new Category();
        category.setId("id");
        category.setId(null);

        System.out.println(category.getId());
    }
}
