import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Product> products2 = new ArrayList<>();
        Shop shop = new Shop(new ArrayList<Product>());

        Product product1 = new Product(15L, "hleb", 25);
        Product product2 = new Product(13L, "salo", 40);
        Product product3 = new Product(12L, "cheese", 35);
        Product product4 = new Product(14L, "cheese", 50);


        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.deleteProduct(product2);
        shop.getAllProducts();
        System.out.println();
        product1.setPrice(78);
        product1.setName("beaf");
        shop.getAllProducts();

//        shop.products.stream()
//                .sorted(Comparator.comparingInt(Product::getPrice)
//                        .thenComparingInt(Product::getPrice))
//                .forEach(product -> System.out.println(product.toString()));

    }
}