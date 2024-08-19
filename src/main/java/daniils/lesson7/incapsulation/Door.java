package daniils.lesson7.incapsulation;

public class Door {

    boolean isOpened;

    void open(){
        if (!isOpened){
            return;
        }
        isOpened = true;
    }

    void close(){
        if (isOpened){
            return;
        }
        isOpened = false;
    }

}
