package module01.lesson09;

public class ProgramTask91 {
    public static void main(String[] args) {
        /**
         * How many objects will be in a String Pool?
         *
         * String st = "Java"; -- новый объект в пуле
         * String st2 = new String("Java"); -- уже есть в пуле
         * String st3 = st2.intern();  -- есть в пуле
         * String st4 = "java";  -- новый объект в пуле, т.к. регистр другой
         * String st = null;  -- нет значения
         * String st6 = new String("JAVA"); - новый объект в пуле, т.к. регистр другой
         */
        //4
    }
}
