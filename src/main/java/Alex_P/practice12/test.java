package Alex_P.practice12;

public class test {
    public static void main(String[] args) {
        Book bookOne = new Book("Как дальше жить?", "Alex");
        Book bookTwo = new Book("Как закалялась сталь", "Островский");
        Book bookTree = new Book("Алфавит", "Островский");

        Catalog catalog = new Catalog();

        catalog.addBook(bookOne);
        catalog.addBook(bookTwo);
        catalog.addBook(bookTree);

        System.out.println(catalog);

//        System.out.println("Введит uuid книги");
//        Scanner scanner = new Scanner(System.in);
//        String uuid = scanner.nextLine();
        System.out.println("Ваш uuid: " + catalog.findUUID(bookOne));

    }
}
