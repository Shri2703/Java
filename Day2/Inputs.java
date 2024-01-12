import java.util.Scanner;

public class Inputs{
    public static void main(String[] args){
        // Primitives data type:Its means when you can't breack the data type into another data type
        // int rollno = 64;
        // char lettes = 'p';
        // float marks = 98.67;
        // double largeDecimaNumber = 345678.45678f;
        // long largeInteger = 23435456756452312L;
        // boolean check = false;

        //Scanner input = new Scanner (System.in);
        //integer
        // System.out.print("Please Enter Some Inputs:");
        // int rollno = input.nextInt();
        // System.out.println("Your roll number :"+ rollno);

        //string
        // String name = input.nextLine();
        // System.out.println(name);

        //Float
        // float marks input.nextFloat();
        // System.out.println(marks);
        

        // sum of two numbers
        // int num1 = input.nextInt();
        // int num2= input.nextInt();
        // int sum =  num1 + num2;
        // System.out.println("Sum = " + sum);

        //typecasting
        // int num = (int) (67.56f);
        // System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b (byte) (a); // 257 % 256 = 1


        // byte a = 40; byte can hold 256 as its size
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c; here a*b gives 2000 its not in the range og byte the java make the byte tyoe into int while the operation and finally make it as a byte
        // System.out.println(d);

        // int number ='A'
        // System.out.println(number) output will be 65
        
        // all type and the type casting 
        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 50000;
        // float f= 5.67f;
        // double d = 0.1234;
        // double result = ((f ⋆ b) + (i % c) - (d * s));
        //   // float + int - double = double
        // System.out.println((f * b) + " " + (i % c) + " " + (d * s));
        // System.out.println(result);

        //condition ststements
        // if tatement
        // int a = 10;
        // if (a == 10) {
        // System.out.println("Hello World");
        // }
        // else{
        // System.out.println("Hello  people");
        // }

        //   int salary = 25400;
        // if (salary > 10000) {
        // salary = salary + 2000;
        // } else {
        // salary = salary + 1000;
        // }

          // multiple if-else
        // if (salary > 10000) {
        // salary += 2000; // salary = salary + 2000
        // } else if (salary > 20000) {
        // salary += 3000;
        // } else {
        // salary += 1000;
        // }
        // System.out.println (salary);


        //While 
        // int count = 1;
        // while (count != 5) {
        // System.out.println(count);
        // count++;
        // }
        
        // for loop
        // for(int count=1;count !=5;count++) {
        //      System.out.println(count);
        // }


        //temperature to heat
        Scanner in =  new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC= in.nextFloat();
        float tempF= (tempC * 9%5) + 32;
        System.out.println(tempF);

        

        // Non-Primitive Data Type or Object Data type: such as 
        // String:Syntax: Declaring a string

        // <String_Type> <string_variable> = “<sequence_of_string>”;,
        // Array, etc.


 
    }
}