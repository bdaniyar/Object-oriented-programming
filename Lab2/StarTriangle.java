package Lab2;

public class StarTriangle {
    private int width;

    // Конструктор (width = сколько [*] в последней строке)
    public StarTriangle(int width) {
        this.width = width;
    }

    // Метод который возвращает треугольник строкой
    public String toString() {
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