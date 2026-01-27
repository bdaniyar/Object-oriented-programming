import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        System.out.println("Enter your word: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();
        // we use StringBuilder() because we cant change usual String(because its immutable)
        // to reverse it we used StringBuilder()
        // toString() makes StringBuilder type into String type

        if(s.equals(reversed)){
            System.out.println("Yes, its palindrome");
        }
        else{
            System.out.println("No, its not palindrome");
        }
    }
}
