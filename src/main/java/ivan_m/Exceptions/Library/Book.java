package ivan_m.Exceptions.Library;

import java.util.Objects;

public class Book {
    final private String title;
    private String author; // В программе будет использоваться только поле title, поэтому остальные инициализировать не буду, но для приличия пусть будут хотя бы объявлены)
    private int publicationYear;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

}
