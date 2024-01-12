import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    //      String fruit = in.next();
         
    //     switch (fruit) {
    //        case "Mango" -> System.out.println("King of fruits");
    //        case "Apple" -> System.out.println("A sweet red fruit");
    //        case "Orange" -> System.out.println("Round fruit");
    //        case "Grapes" -> System.out.println("Small fruit");
    //        default -> System.out.println("please enter a valid fruit");
    //    }
      
           int day = in.nextInt();
           


    //switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}    