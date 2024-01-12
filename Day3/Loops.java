import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        // print numbers from 1 to n
        //Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }
         // for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }


        // while loops
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

//        

        // int num  = 1;
        // while (num <= 5) {
        //     System.out.println(num);
        //     num += 1;
        // }

        // do while
        /*

            do {
                // body
            } while (condition);

         */
        // int n = 1;
        // do {
        //     System.out.println("Hello World");
        // } while (n != 1);
          

       //Largest Number   

        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }

        // int max = Math.max(c, Math.max(a, b));

        // System.out.println(max);

        //CaseCheck
        // Scanner in = new Scanner(System.in);
        // char ch = in.next().trim().charAt(0);

        // if (ch >= 'a' && ch <= 'z') {
        //     System.out.println("Lowercase");
        // } else {
        //     System.out.println("Uppercase");
        // }
        

        //Fibonaaci
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while (count <= n) {
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }

        // System.out.println(b);


        //CountNumber
        //  int n = 4555555;

        // int count = 0;
        // while (n > 0) {
        //     int rem = n % 10;
        //     if (rem == 5) {
        //         count++;
        //     }
        //     n = n / 10; // n /= 10
        // }

        // System.out.println(count);

        //reverse
        int num = 123456;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
        


    }
}