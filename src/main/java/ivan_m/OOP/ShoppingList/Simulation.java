package ivan_m.OOP.ShoppingList;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productsAmount, actionNumber;
        String productName;
        System.out.println("Введите количество продуктов:");
        productsAmount = Integer.parseInt(scanner.nextLine());
        String[] productsMas = new String[productsAmount];
        System.out.println("Заполните список продуктов:");

        for (int i = 0; i < productsMas.length; i++){
            System.out.println("Введите название " + (i+1) + "го продукта:");
            productsMas[i] = String.valueOf(scanner.nextLine());
        }
        ShoppingList shoppingList = new ShoppingList(productsMas);

        System.out.println("Отлично! Список продуктов создан");
        do {
            System.out.println("Выберите, что Вы хотите сделать");
            System.out.println("1 - Добавить продукт в список\n" +
                    "2 - Удалить продукт из списка\n" +
                    "3 - Вывести список на экран\n" +
                    "4 - Выйти");
            actionNumber = Integer.parseInt(scanner.nextLine());
            switch (actionNumber){
                case 1://Пытался создать новый список хотя бы вне класса
                    System.out.println("Введите название продукта, который хотите добавить:");
                    productName = String.valueOf(scanner.nextLine());
                    String[] newProductsMas = new String[productsAmount++];
                    for (int i = 0; i < productsMas.length; i++){
                        newProductsMas[i] = productsMas[i];
                    }
                    newProductsMas[newProductsMas.length - 1] = productName;
                    ShoppingList newShoppingList = new ShoppingList(newProductsMas);
                    break;
                //case 2: System.out.println("Введите название продукта, который хотите удалить:");
                  //  productName = scanner.nextLine();
                   // break;
                case 3: System.out.println(shoppingList.toString());
                    //System.out.println(newShoppingList.toString());
                    break;
                case 4:
                    System.out.println("До свиданья!");
                    break;
                default:
                    System.out.println("Вы не выбрали нужный вариант. Попробуйте ещё раз");
                    break;
            }
        }while (actionNumber != 4);


    }


}
