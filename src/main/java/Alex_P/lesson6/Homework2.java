package Alex_P.lesson6;

//Дополнительное задание
//
//Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя
//свойствами:
//количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат.
//
//Сделать функцию, снимающую деньги, которая принимает сумму денег,
//а возвращает булевое значение - успешность выполнения операции.
//При снятии денег функция должна распечатывать каким количеством
//купюр какого номинала выдаётся сумма.
//Создать конструктор с тремя параметрами - количеством купюр каждого
//номинала.

public class Homework2 {
    public static void main(String[] args) {
        MachineATM bankomate = new MachineATM( 20, 10, 5);
        bankomate.withdrawCash(100);
    }
}
