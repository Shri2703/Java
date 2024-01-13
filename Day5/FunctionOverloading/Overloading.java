// Function OverLoading is complile in runtime and the parameter or thr argument should deside which function to run  

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}

//Question 

// import java.util.Scanner;

// public class Questions {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
// //        int n = in.nextInt();
// //        boolean ans = isPrime(n);
// //        System.out.println(ans);

//         for (int i = 100; i < 1000; i++) {
//             if (isArmstrong(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     // print all the 3 digits armstrong numbers
//     static boolean isArmstrong(int n) {
//         int original = n;
//         int sum = 0;

//         while (n > 0) {
//             int rem = n % 10;
//             n = n / 10;
//             sum = sum + rem*rem*rem;
//         }

//         return sum == original;
//     }

//     static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         int c = 2;
//         while (c * c <= n) {
//             if (n % c == 0) {
//                 return false;
//             }
//             c++;
//         }
//         return c * c > n;
//     }
// }