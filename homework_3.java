import java.util.Scanner;
   public class MyBox {

        private float a, b, h;
        private double v, litr;

        public MyBox(float a, float b, float h) {
            this.a = a;
            this.b = b;
            this.h = h;
            this.calculateVolume();
            this.outputResult();
        }

        public MyBox(String string){
            this.createBoxWithConsole();
        }
//        public MyBox(int a, int b,int h) {       Для себя поэксперементировал с методами и с конструкторами.
//            this.a = a;                          Буду признателен за развёрнутый комментарий.
//            this.b = b;
//            this.h = h;
//            this.calculateVolume();
//            this.outputResult();

        public void setParametersByConsole() {
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
            this.v = a * b * h;
            this.litr = v * 0.001;
            return v;
        }
        public void outputResult(){
            System.out.println();
            System.out.println("Объём коробки состовляет " + String.format("%.1f",v) + " см.³ или " + String.format("%.3f",litr) + " л.");

        }
        public void createBoxWithConsole(){
            this.setParametersByConsole();
            this.calculateVolume();
            this.outputResult();
        }

    }
