import java.util.Scanner;

// Q. Find the sum of the numbers using recursion and for loop.
public class Question4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();

          System.out.println("Sum 1 to " + n + " using recursion : "  + sum(n));
          int sum = 0;
          for(int i = 1; i <= n; i++) {
               sum += i;
          }
          System.out.println("Sum 1 to " + n + " using loop : "  + sum);
     }

     static int sum(int n) {
          if(n == 1) {
               return 1;
          }
          return n + sum(n-1);
     }
}
