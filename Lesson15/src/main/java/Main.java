import ShopHelper.ShopHelper;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        Shop shop = new Shop(new ArrayList<Product>());

        Product product1 = new Product(9L, "hleb", 25);
        Product product2 = new Product(100L, "salo", 40);
        Product product3 = new Product(12L, "cheese", 35);
        Product product4 = new Product(57L, "cheese", 50);

        ShopHelper shopHelper = new ShopHelper();
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.getAllProducts();
        shopHelper.matterOfChoice();

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                shopHelper.sortingIssue();
                shop.getAllProducts();
                int priceChoice = scanner.nextInt();
                if (priceChoice == 1) {
                    shop.sortIncrease();
                    shop.getAllProducts();
                }
                if (priceChoice == 2) {
                    shop.sortDecrease();
                    shop.getAllProducts();

                } else {
                    System.out.println("Введено неправильное число, повторите!" + priceChoice);

                }
            }
            case 2 -> {
                System.out.println("Введите 3 параметра" + "\n" + "введите id, название, цена");
                Product product5 = new Product(scanner.nextLong(), scanner.nextLine(), scanner.nextInt());
                products.add(product5);
            }
            case 3 -> System.out.println("Введите id товара который стоит удалить");

//                int idChoice = scanner.nextInt();
//              if (idChoice==products.contains(product)){


//                     ◦ Удаление товара. При выборе этого действия:
//     *      ▪ пользователь вводит id товара который нужно удалить
//                        *      ▪ удаляем товар из магазина


            case 4 -> {
                System.out.println("Введите 3 параметра" + "\n" + "введите id, название, цена");
                Product product6 = new Product(scanner.nextLong(), scanner.nextLine(), scanner.nextInt());
                shop.updateProduct(product6);
            }
            case 5 -> System.out.println("Конец работы магазина");
            default -> System.out.println("Неверный выбор!");
        }

    }

}