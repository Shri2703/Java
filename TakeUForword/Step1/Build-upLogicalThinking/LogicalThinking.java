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
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        Pattern1(num);
        // Pattern2(num);
    }
}