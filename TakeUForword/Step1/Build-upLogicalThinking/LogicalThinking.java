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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        
        Pattern1(num);

    }
}