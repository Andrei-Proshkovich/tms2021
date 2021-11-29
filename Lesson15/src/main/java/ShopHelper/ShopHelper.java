package ShopHelper;

public class ShopHelper {

    public void matterOfChoice() {
        System.out.println("Choose action" + "\n" +
                "1 -Вывод всех товаров." + "\n" +
                "2 - Добавление товара." + "\n" +
                "3 - Удаление товара." + "\n" +
                "4 - Редактирование товара." + "\n" +
                "5 - Выход.");
    }

    public void sortingIssue() {
        System.out.println("В какой сортировке вывести?\n" +
                "1- по цене(возрастание)\n" +
                "2 - по цене(убывание)\n" +
                "3 - по добавлению(сначала новые, потом более старые)");
    }
}
