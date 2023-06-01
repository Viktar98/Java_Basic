package homework_java_basic;

import java.util.Scanner;

public class Box {
    public float a, b, h;
    public double v;
    public Box(float a, float b, float h) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.v = a * b * h;
        System.out.println("Объём коробки состовляет " + String.format("%.2f",v) + " см².");
    }


    //Для себе поэксперементировал с методами
    public void setParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Впишите габариты коробки:");
        System.out.print("Ширина, см: ");
        this.a = sc.nextFloat();
        System.out.print("Длина, см: ");
        this.b = sc.nextFloat();
        System.out.print("Высота, см: ");
        this.h = sc.nextFloat();
    }
    public double calculateVolume(){
        return a * b * h;
    }
    public void outputVolume(){
        System.out.println();
        System.out.println("Объём коробки состовляет " + String.format("%.2f",v) + " см².");
    }

    public void makeBoxWithConsole(){
        setParameters();
        calculateVolume();
        outputVolume();
    }

}

