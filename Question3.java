import java.util.Scanner;

// Q. Take the input from the user and find the term of the fibonacci series using recursion and for loop.
public class Question3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          
          System.out.println("Using recursion : " + fibonacci(n));
          int first = 0, second = 1;
          for(int i = 2; i < n; i++) {
               int term = second;
               second += first;
               first = term;

          }
          System.out.println("Using Loop : " + second);
     }

     static int fibonacci(int n) {
          if(n == 1) {
               return 0;
          }
          if(n == 2) {
               return 1;
          }
          return fibonacci(n-1) + fibonacci(n-2);
     }
}
