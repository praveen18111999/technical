import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        str rev = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            rev  = rev + s1.charAt(i);
        }
        System.out.println("reversed string: " + rev str);
    }
}