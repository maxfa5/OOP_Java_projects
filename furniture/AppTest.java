package OOP.furniture;


public class AppTest {
    public static void main(String[] args) {
        Table test1 = new Table("a", "black", 10, 5, "Oak", 2, 6, 100);
        test1.appedRating(4);
        System.out.printf("Тест на рейтинг:\n%s\n\n", test1.getRating_());

        Shop shop = new Shop();
        shop.addFurniture(test1);
        shop.addFurniture(test1);
        shop.addFurniture(test1);
        System.out.printf("Тест на общую цену и удаление элементов:%s\n", shop.allPrices());
        shop.removeFurnitureByObj(test1);
        shop.removeFurnitureByObj(test1);
        shop.removeFurnitureByObj(test1);
        System.out.printf("%s\n\n\n", shop.allPrices());


        shop.addFurniture(test1);
        shop.addFurniture(test1);
        shop.addFurniture(test1);
        System.out.printf("Тест на удаление элементов полностью за раз:%s\n", shop.allPrices());
        shop.removeAllFurnitureByObj(test1);
        System.out.printf("%s\n", shop.allPrices());


        shop.addFurniture(test1);
        System.out.printf("%s\n", shop.allPrices());
        shop.removeFurnitureByObj(test1);
        System.out.printf("%s\n", shop.allPrices());
    }
}