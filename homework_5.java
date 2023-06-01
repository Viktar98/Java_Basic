public class CaloriesDifference {
    private static float caloriesRate = 40.0F;
    public static double calculateCaloriesDifference(int a, int b) {
        return Math.PI * (a + b) * (a - b) * caloriesRate / 4;
    }

    public static void main(String[] args) {
        System.out.println("Difference is " + String.format("%.2f",calculateCaloriesDifference(28,24)/1000) + " kcals.");
    }

}
