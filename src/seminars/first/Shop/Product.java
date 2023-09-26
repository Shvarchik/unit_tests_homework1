package seminars.first.Shop;

public class Product {
    Integer cost; // Стоимость продукта
    String title; // Название

    public Product(Integer cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString (){
        return String.format("%s, %d", this.title, this.cost);
    }
}