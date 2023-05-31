package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //System.out.println(!(!(true||false)&&false));
        int q = 10;
        int w = 20;
        int e = 30;
        int r = 40;
        boolean temp1 = q < w;
        boolean temp2 = e < r;
        System.out.println();
        System.out.println((q<w)+" && "+(e<r)+" >> "+(temp1&&temp2));
        System.out.println((q>w)+" && "+(e<r)+" >> "+(!temp1&&temp2));
        System.out.println((q>w)+" && "+(e>r)+" >> "+!(temp1&&temp2));
        System.out.println();
        System.out.println((q<w)+" || "+(e<r)+" >> "+(temp1||temp2));
        System.out.println((q>w)+" || "+(e<r)+" >> "+(!temp1||temp2));
        System.out.println((q>w)+" || "+(e>r)+" >> "+!(temp1||temp2));
        System.out.println();
        System.out.println("!("+(q < w)+") >> "+!(q < w));
        System.out.println("!("+(q > w)+") >> "+!(q > w));


    }
}
