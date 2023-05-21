package homework_java_basic;

public class homework_2 {
    public static void main(String[] args) {
        char ch = '4';
        int result2, result1;
        result1 = Integer.parseInt(String.valueOf(ch));
        result2 = Character.getNumericValue(ch);
        System.out.println(result1 + 6);
        System.out.println(result2 + 6);
    }
}
