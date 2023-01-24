import java.util.Scanner;

// Q. Find the power of 2 using Recursion. Also take the input from the user.

public class Question2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int res = 1;
          for(int i = 1; i <= n; i++) {
               res *= 2;
          }
          System.out.println("Power of Two using loop : " + res);

          System.out.println("Power of Two using Recursion : "+ power(n, 1));
     }

     static int power(int n, int res){
          if(n == 0) {
               return 1;
          }
          return 2*power(n-1, res*res);
     }
}
