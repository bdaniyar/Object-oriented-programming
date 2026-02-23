package pr2;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() { // method to return the triangle as a string
        String result = "";

        for (int row = 1; row <= width; row++) {
            for (int star = 1; star <= row; star++) {
                result += "[*]";
            }
            result += "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    }
}