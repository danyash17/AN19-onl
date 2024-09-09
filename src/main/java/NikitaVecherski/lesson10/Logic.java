package NikitaVecherski.lesson10;

public class Logic {


    public static String task1(String docNum) {
        return docNum.substring(0, 4) + docNum.substring(9, 13);
    }

    public static String task2(String docNum) {
        StringBuilder st = new StringBuilder(docNum);
        st.replace(5, 8, "***");
        st.replace(14, 17, "***");
        docNum = st.toString();
        return docNum;
    }

    public static String task3(String docNum) {
        docNum.toLowerCase();
        return docNum.substring(5, 8) + "/" + docNum.substring(14, 17) + "/" + docNum.substring(19, 20) + "/" + docNum.substring(21);
    }

    public static String task4(String docNum) {
        StringBuilder st = new StringBuilder(docNum);
        docNum.toUpperCase();
        st.delete(0, 5); //последний не включительно
        st.setCharAt(3, '/');
        st.delete(4, 9);
        st.setCharAt(7, '/');
        st.deleteCharAt(8);
        st.setCharAt(9, '/');
        docNum = st.toString();
        return "Letters:" + docNum;
    }

    public static boolean task5(String docNum) {
        docNum = docNum.toLowerCase();
        return docNum.contains("abc");
    }

    public static boolean task6(String docNum){
        return docNum.startsWith("555");
    }

    public static  boolean task7(String docNum){
        return docNum.endsWith("1a2b");
    }

}


