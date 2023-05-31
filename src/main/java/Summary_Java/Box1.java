package Summary_Java;

public class Box1 {
    public int width = 50000;
    public int length = 20;
    public int height = 50;

    public Box1(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;

    }

    public int calculateVolume(){
        return width * length * height;
    }

}