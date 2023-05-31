package IfElseExamples;

public class Example3 {
    public static void main(String[] args) {
        boolean goodWather = true;
        boolean freeTime = true;

        if (goodWather){
            System.out.println("Едем за город");
            if (freeTime){
                System.out.println("Катаемся на лошади");
            }
        }
    }
}
