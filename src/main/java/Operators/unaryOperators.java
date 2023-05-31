package Operators;

public class unaryOperators {
    public static void main(String[] args) {
    int q = 123;
    System.out.println();
    }

    public static void getExample5() {
        int q = 10;
        System.out.println(q);
        System.out.println(q++); //сначала вывод.потом математика
        System.out.println(--q); //сначала математика.потом вывод
    }
    public static void getExample4() {
        int q = 10;
        System.out.println(q);
        System.out.println(++q);
        System.out.println(--q);
    }
    public static void getExample3() {
        int q = 10;
        System.out.println(q);
        q++;
        System.out.println(q);
        q--;
        System.out.println(q);
    }
        public static void getExample2() {
        int q = 10;
        System.out.println(q);
        ++q;
        System.out.println(q);
        --q;
        System.out.println(q);
    }
        public static void getExaple1() {
        int q = 10;
        System.out.println(q);
        q = q + 1;
        System.out.println(q);
        q = q - 1;
        System.out.println(q);

    }
}
