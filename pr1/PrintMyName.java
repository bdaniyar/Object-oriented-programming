import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = sc.nextLine();
       String horizontalBorder = "+";
       for(int i=0;i< name.length() + 2;i++){
          horizontalBorder += "-";
       }
       horizontalBorder += "+";
       sc.close();
       System.out.println(horizontalBorder);
       System.out.println("| " + name + " |");
       System.out.println(horizontalBorder);
    }
}
