package randomExamples;

public class Example2 {
    public static void main(String[] args) {

        double q = Math.random(); //
        double w = (int)(Math.random() * 100); // [0,99] [0.100)
        double e = (int)(Math.random() *(1 + 17)) + 3; // [3,20] [3.21)
        System.out.println(e); //
        // формула трансформации из [0;1) -> [min; max)
        // (int) (Math.random() * (max - min)) + min

        // формула трансформации из [0;1) -> [min; max]
        // (int)(Math.random() * ((max - min) + 1)) + min


    }
}
