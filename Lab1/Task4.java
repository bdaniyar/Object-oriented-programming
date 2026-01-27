import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int D = b*b - 4*a*c;

        if(D<0){
            System.out.println("Error");
        }
        else{
            System.out.println(D);
        }

    }
}
