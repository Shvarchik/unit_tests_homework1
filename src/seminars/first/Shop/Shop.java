package seminars.first.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        Comparator<Product> productComparator = Comparator.comparing(Product::getCost);
        // Comparator.comparing(obj -> obj.getCost());
        products.sort(productComparator);
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct;
        int index = 0;
        int maxCost = 0;
        for (Product product: products) {
            if (product.getCost() > maxCost){
                maxCost = product.getCost();
                index = products.indexOf(product);
            }
        }
        return products.get(index);
    }

}