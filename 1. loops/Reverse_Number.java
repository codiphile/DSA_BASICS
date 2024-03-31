import java.util.Scanner;
/**
 * Reverse_Number
 */
public class Reverse_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse : ");
        int n = sc.nextInt();
        while(n > 0){
            int l = n % 10;
            System.out.print(l);
            n /= 10;
        }
    }
}