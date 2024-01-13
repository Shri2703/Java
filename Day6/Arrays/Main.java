//Arrays
public class Main {

    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Kunal Kushwaha";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(ros[1]); it will give you the output as 0 

        String[] arr = new String[4];
        System.out.println(arr[0]);//it wil print null as irs output

//        for (String element : arr) {
//            System.out.println(element);
//        }

    }
}


//Inputs as arrays

// import java.util.Arrays;
// import java.util.Scanner;

// public class Input {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         // array of primitives
//         int[] arr = new int[5];
//         arr[0] = 23;
//         arr[1] = 45;
//         arr[2] = 233;
//         arr[3] = 543;
//         arr[4] = 3;
//         // [23, 45, 233, 543, 3]
//         System.out.println(arr[3]);

//         // input using for loops
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = in.nextInt();
//         }
// //
// //        System.out.println(Arrays.toString(arr));

// //        for (int i = 0; i < arr.length; i++) {
// //            System.out.print(arr[i] + " ");
// //        }

// //        for(int num : arr) { // for every element in array, print the element
// //            System.out.print(num + " "); //  here num represents element of the array
// //        }

// //        System.out.println(arr[5]); // index out of bound error

//         // array of objects
//         String[] str = new String[4];
//         for (int i = 0; i < str.length; i++) {
//             str[i] = in.next();
//         }

//         System.out.println(Arrays.toString(str));

//         // modify
//         str[1] = "kunal";

//         System.out.println(Arrays.toString(str));
//     }
// }