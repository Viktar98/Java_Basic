package Summary_Java;
import java.util.Scanner;

public class Box3 {

    Scanner sc = new Scanner(System.in);
    float a;
    float b;
    float h;
    double v;

    public Box3(float a, float b, float h, double v) {
        System.out.println("Впишите габариты коробки:");
        System.out.print("Ширина, см: ");
        this.a = sc.nextFloat();
        System.out.print("Длина, см: ");
        this.a = sc.nextFloat();
        System.out.print("Высота, см: ");
        this.a = sc.nextFloat();
    }

}



