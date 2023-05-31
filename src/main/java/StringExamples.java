public class StringExamples {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";
        //сравнения:
        //a == b > сравнение ссылок;
        // (a.eqals(b)) > сравнение значения переменных
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
