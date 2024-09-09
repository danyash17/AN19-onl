package Alex_P.practice12;

import java.util.TreeMap;
import java.util.UUID;

public class Catalog {

    private TreeMap treeMap = new TreeMap<Book, String>();

    public void addBook(Book book) {
        UUID uuid = UUID.randomUUID();
        this.treeMap.put(book, uuid.toString());
    }

    public Book findBook(String uuid) {
        return(Book) this.treeMap.get(uuid);
    }

    public String findUUID(Book book) {
        return(String) this.treeMap.get(book);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "treeMap=" + treeMap +
                '}';
    }
}
