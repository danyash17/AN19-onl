package EugeneFrost.lesson9.TaskLibrary;

import java.io.FileNotFoundException;

public class BookNotFoundException extends FileNotFoundException{
    public BookNotFoundException(){
        super("Книга не найдена!");
    }
}