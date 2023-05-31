package randomExamples;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {

        Random r = new Random();
        r.setSeed(233L); //точка отсчёта

        boolean q = r.nextBoolean(); //true - false


        int w = r.nextInt(); //
        int e = r.nextInt(10); // [0,10)
        int t = r.nextInt(20,25); // [20,25)


        double y = r.nextDouble(); // [0,1)

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(t);
        System.out.println(y);


    }
}
