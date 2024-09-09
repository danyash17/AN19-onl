/*Создайте класс ShoppingList, который будет содержать список продуктов (например, в виде массива или списка).
 Реализуйте методы для добавления, удаления и отображения продуктов, а также переопределите метод toString().
*/

package ivan_m.OOP.ShoppingList;

import java.util.Arrays;
// Cразу оговорюсь, задача нерешена. Есть много вопросов, и даже тяжело просто описать, что не понятно.
// Но если обобщить, то можно сказать, что просто не понимаю, как создавать новый список другого размера, чтобы он оставался с таким же именем.
// Причём дополнительная сложность в том, как сделать это в отдельном методе внутри класса
public class ShoppingList {
    private String products;

    public ShoppingList(String... products) {
        this.products = Arrays.toString(products); //products - это массив или нет?...
    }

//    public String addProduct(String newProduct) {
//
//    }


    @Override
    public String toString() {
        return "ShoppingList{" +
                "products='" + products + '\'' +
                '}';
    }
}
