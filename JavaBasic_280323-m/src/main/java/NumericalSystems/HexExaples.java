package NumericalSystems;

import com.auto.finland.Car;

public class HexExaples {
    public static void main(String[] args) {
        int q = 542;
        System.out.println(542/16); //33
        System.out.println(542%16);     //14
        System.out.println(33%16); //2
        System.out.println(33%16);      //1
        System.out.println(2/16);  //0
        System.out.println(2%16);       //2
        int q16 = 0x21e;
        //Более короткий путь из 10 в 16
        System.out.println(Integer.toHexString(q));
        //Длинный путь из 16 в 10
        double result = 2 * Math.pow(16,2) + 1 * Math.pow(16,1) + 14 * Math.pow(16,0);
        // Короткий путь из 16 в 10
        System.out.println(q16);
        System.out.println(new Car());
    }
}
