import java.util.Scanner;

import java.util.*;
public class Fibonacci
{

        public static int fib(int n)
        {
            if (n <= 1) {
                return n;
            }

            return fib(n - 1) + fib(n - 2);
        }

    static void nearestFibonacci(int f)
    {

        // Base Case
        if (f == 0)
        {
            System.out.print(0);
            return;
        }

        int f0 = 0, f1 = 1;

        int f2 = f0 + f1;

        while (f2 <= f)
        {

            f0 = f1;
            f1 = f2;
            f2 = f0+ f1;
        }

        // Store the Fibonacci number
        // having smaller difference with N
        int check = (Math.abs(f2 - f) >= Math.abs(f1 - f)) ? f1 : f2;

        // Print the result
        System.out.print(check);
    }


    public static void main(String[] args)
        {
            System.out.println("Enter the value of n");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            System.out.println("F(n) = " + fib(n));

            System.out.println("Enter a number whose nearest Fibonacci to be found");
            int F=sc.nextInt();
            nearestFibonacci(F);


        }
}

