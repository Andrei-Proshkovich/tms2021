import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Shop {
    public ArrayList<Product> products = new ArrayList<>();
    public Product product;

    public Shop(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {

        if (products.contains(product)) {
            System.out.println("The same id!!!");
        } else {
            products.add(product);
        }
    }

    public void getAllProducts() {
        Iterator<Product> iter = products.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


    public void deleteProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
        } else {
            System.out.println("No id!!");
        }
    }

    public void updateProduct(Product product) {
        products.set(products.indexOf(product), product);

    }


    public void sortIncrease() {
        products.sort(Comparator.comparingInt(Product::getPrice));
    }

    public void sortDecrease() {
        products.sort(Comparator.comparingInt(Product::getPrice).reversed());

    }
}

