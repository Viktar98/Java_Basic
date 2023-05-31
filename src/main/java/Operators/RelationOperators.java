package Operators;

import java.util.Random;

public class RelationOperators {
    public static void main(String[] args) {
        int q = 10;
        //<
        int temp1 = getRandomInt(5,15);
        System.out.println("q < " + temp1 + " = " + (q < temp1));
        //>
        int temp2 = getRandomInt(5,15);
        System.out.println("q > " + temp1 + " = " + (q > temp1));
        // <=
        int temp3 = getRandomInt(5,15);
        System.out.println("q <= " + temp1 + " = " + (q <= temp1));
        // >=
        int temp4 = getRandomInt(5,15);
        System.out.println("q >= " + temp1 + " = " + (q >= temp1));
        // ==
        int temp5 = getRandomInt(5,15);
        System.out.println("q == " + temp1 + " = " + (q == temp1));
        // !=
        int temp6 = getRandomInt(5,15);
        System.out.println("q != " + temp1 + " = " + (q != temp1));
        System.out.println();
        example1();
    }
        public static int getRandomInt(int min, int max){
            Random r = new Random();
            return r.nextInt(min,max+1);
        }
        public static void example1(){
            int q = 10;
            int w = 20;
        System.out.println("q = "+q+"; w = "+w+";");
        System.out.println("q < w "+(q < w));
        boolean result1 = q < w;
        System.out.println("q = "+q+"; w = "+w+";");
        System.out.println("q > w "+(q > w));
        boolean result2 = q > w;
        System.out.println("q = "+q+"; w = "+w+";");
        System.out.println("q != w "+(q != w));
        boolean result3 = q != w;
        System.out.println("q = "+q+"; w = "+w+";");
        System.out.println("q == w "+(q == w));
        boolean result4 = q == w;
        System.out.println("q = "+q+"; w = "+w+";");
        System.out.println("q <= w "+(q <= w));
        boolean result5 = q <= w;
        System.out.println("q = "+q+"; w = "+w+";");
        System.out.println("q >= w "+(q >= w));
        boolean result6 = q >= w;
    }
}
