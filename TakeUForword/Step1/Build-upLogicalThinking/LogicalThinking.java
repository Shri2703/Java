import java.util.Scanner;

public class LogicalThinking{
    // static void Pattern1(int num){
    //     for(int i= 1; i<= num;i++){
    //         for(int j=1; j<= num ;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // * * * * * * *
    // * * * * * * *
    // * * * * * * *
    // * * * * * * *
    // * * * * * * *
    // static void Pattern1(int num){
    //     for(int i= 0; i < num;i++){
    //         for(int j=0; j <= i ;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // static void Pattern1(int num){
    //     for(int i= 1; i <= num;i++){
    //         for(int j=1; j <= i ;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    
    // static void Pattern1(int num){
    //     for(int i= 1; i <= num;i++){
    //         for(int j=1; j <= i ;j++){
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5
    // static void Pattern1(int num){
    //     for(int i = 0; i< num; i++){
    //         for(int j= num ; j >i; j--){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // * * * *
    // * * *
    // * *
    // *
    // static void Pattern1(int num){
    //     for(int i = 0; i< num; i++){
    //         for(int j= num ; j >i; j--){
    //             System.out.print(num-j+1+ " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // 1 2 3
    // 1 2
    // 1
    // static void Pattern1(int num){
    //     for(int i = 0; i< num; i++){
    //         for(int j = 0;j < num-i-1;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j = 0;j < 2*i+1;j++){
    //             System.out.print("*");
    //         }
    //         for(int j = 0;j < num-i-1;j++){
    //             System.out.print(" ");
    //         }
            
    //         System.out.println();
    //     }
    // }
    //   *
    //  ***
    // *****

    // static void Pattern2(int num){
    //     for(int i = 0; i < num; i++){
    //         for(int j = 0;j < i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j = 0;j < 2*num -(2*i +1);j++){
    //             System.out.print("*");
    //         }
    //         for(int j = 0;j < i;j++){
    //             System.out.print(" ");
    //         }
            
    //         System.out.println();
    //     }
    // }
    // *****
    //  ***
    //   *

//     static void Pattern1(int num){
//         for(int i = 0; i< num; i++){
//             for(int j = 0;j < num-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 0;j < 2*i+1;j++){
//                 System.out.print("*");
//             }
//             for(int j = 0;j < num-i-1;j++){
//                 System.out.print(" ");
//             }
            
//             System.out.println();
//         }
//     }
//     static void Pattern2(int num){
//         for(int i = 0; i < num; i++){
//             for(int j = 0;j < i;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 0;j < 2*num -(2*i +1);j++){
//                 System.out.print("*");
//             }
//             for(int j = 0;j < i;j++){
//                 System.out.print(" ");
//             }
            
//             System.out.println();
//         }
//     }
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
    // static void Pattern1(int num){
    //     for(int i = 0; i< num; i++){
    //         for(int j = 0;j < 2*i+1;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // static void Pattern2(int num){
    //     for(int i = 0; i < num; i++){
    //         for(int j = 0;j < 2*num -(2*i +1);j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // *
    // ***
    // *****
    // *******
    // *********
    // *********
    // *******
    // *****
    // ***
    // *
    // static void Pattern1(int num){
    //     for (int i =1;i <= 2*num - 1;i++){
    //         int stars = i;

    //         if (i > num) stars = 2*num-i;
    //         for(int j =1;j<= stars;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    // static void Pattern1(int num){
    //     for(int i = 0; i < num;i++){
    //         int stars = 0;
    //         if (i%2 == 0)stars = 1;
    //         else stars = 0;
    //         for(int j = 0;j <= i;j++){
    //             System.out.print(stars);
    //             stars = 1 - stars;
    //         }
    //         System.out.println();
    //     }
    // }
    // 1
    // 01
    // 101
    // 0101
    // 10101

    // static void Pattern1(int num){
    //     int space = 2*(num-1);
    //     for(int i =1 ;i <= num;i++){
    //         for(int j = 1;j<= i;j++){
    //             System.out.print(j);
    //         }
    //         for(int j = 1;j<= space;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j = i;j>= 1;j--){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //         space -= 2;
    //     }
    // }
    // 1        1
    // 12      21
    // 123    321
    // 1234  4321
    // 1234554321

    // static void Pattern1(int num){
    //     int n = 1;
    //     for(int i =1 ;i <= num;i++){
    //         for(int j = 1;j<= i;j++){
    //             System.out.print(n +" ");
    //             n +=1;
    //         }
    //         System.out.println(); 
    //     }
    // }
    // 1 
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    // static void Pattern1(int num){
    //     for (int i = 0;i< num;i++){
    //         for(char ch = 'A';ch <= 'A' + i;ch++){
    //             System.out.print(ch + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // A
    // A B
    // A B C
    // A B C D
    // A B C D E
    // static void Pattern1(int num){
    //     for (int i = 0;i< num;i++){
    //         for(char ch = 'A';ch <= 'A'+(num-i-1);ch ++ ){
    //             System.out.print(ch + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // A B C D E
    // A B C D
    // A B C
    // A B
    // A

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        Pattern1(num);
        // Pattern2(num);
    }
}