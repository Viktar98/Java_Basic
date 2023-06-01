package NumericalSystems;

public class OctalExaples {
    public static void main(String[] args) {
        int q = 542;
        //долгий перевод
        System.out.println(q / 8); //67
        System.out.println(q % 8);      //6

        System.out.println(67 / 8); //8
        System.out.println(67 % 8);     //3

        System.out.println(8 / 8); //1
        System.out.println(8 % 8);      //0

        System.out.println(1 / 8); //0
        System.out.println(1 % 8);      //1
        //перевод из 8 в 10
        int q8 = 01036;
        System.out.println(q8);
        System.out.println(1 * Math.pow(8,3) + 0 * Math.pow(8,2) + 3 * Math.pow(8,1) + 6 * Math.pow(8,0));
        //перевод из 10 в 8
        System.out.println(Integer.toOctalString(542));
    }
}
