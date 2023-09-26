package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
public class ShopTest {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add((new Product(10, "чупа-чупс")));
        products.add(new Product(1000, "тортик"));
        products.add(new Product(100, "шоколадка"));
        products.add(new Product(80, "молоко"));
        Shop myShop = new Shop();
        myShop.setProducts(products);
        List<Product> sortedProducts = myShop.sortProductsByPrice();

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).

   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
        assertThat(products).hasSize(4);
        assertThat(products).flatMap(Product::getTitle).contains("чупа-чупс","тортик","шоколадка", "молоко");
        // проверка правильности сортировки
        assertThat(sortedProducts).flatMap(Product::getTitle).containsSequence("чупа-чупс","молоко", "шоколадка", "тортик");

        assertThat(sortedProducts).flatMap(Product::getCost)
                .startsWith(10);

        assertThat(sortedProducts).satisfiesExactly(product -> {
                    assertThat(product.getTitle()).isEqualTo("чупа-чупс");
                    },
                product -> {
                    assertThat(product.getTitle()).isEqualTo("молоко");
                    },
                product -> {
                    assertThat(product.getTitle()).isEqualTo("шоколадка");
                    },
                product -> {
                    assertThat(product.getTitle()).isEqualTo("тортик");
                });

        // 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(myShop.getMostExpensiveProduct().getTitle()).isEqualTo("тортик");
    }
}