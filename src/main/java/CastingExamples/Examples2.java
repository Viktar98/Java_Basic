package CastingExamples;

public class Examples2 {
    public static void main(String[] args) {
        byte q = 10;
        int w = 140;
        double e = 135.45454;

        float a = (float) e; //без потерь данных
        short b = (short) w;

        int c = (int) e; //с потерями данных
        byte d = (byte) w;
        System.out.println(d);
        byte f = (byte) e;
        System.out.println(f);


    }
}
