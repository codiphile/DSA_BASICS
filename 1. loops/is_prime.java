import java.util.Scanner;
/**
 * is_prime
 */
public class is_prime {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
        if(n < 0){
            System.out.println("Not Prime");
        }
        if(n == 2){
            System.out.println("Prime");
        }
        if(n > 2){
            boolean flag = true;
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }

   }
}