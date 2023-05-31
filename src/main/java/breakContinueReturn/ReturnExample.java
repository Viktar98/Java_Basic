package breakContinueReturn;

public class ReturnExample {
    public static void main(String[] args) {
        int[] a = {5,8,2,4,1,0};
        //fori - шаблон цикла for
        for (int i = 0; i < a.length; i++) {
            if (a[i]==4) return;
            System.out.println(a[i]);
        }
        System.out.println('$');
    }
}
