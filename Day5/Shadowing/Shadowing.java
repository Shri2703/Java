public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
// the upper limit value will be shawdw when the lower level scope interlaps 




//Variable Length Argiment

// import java.util.Arrays;

// public class VarArgs {
//     public static void main(String[] args) {
// //        fun();
// //        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
// //        demo();
//     }

//     static void demo(int ...v) {
//         System.out.println(Arrays.toString(v));
//     }

//     static void demo(String ...v) {
//         System.out.println(Arrays.toString(v));
//     }

//     static void multiple(int a, int b, String ...v) {

//     }

//     static void fun(int ...v) {
//         System.out.println(Arrays.toString(v));
//     }
// }