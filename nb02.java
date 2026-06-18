//create a java application where we have one class it contain one instance variable, one static variable and non-static method m1 having parameter and return types of default constructor and then invoke all of these under main method by providing dynamic input.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        int a;
        static String b;

        boolean m1(Float c){
        System.out.println(c);
        return sc.nextBoolean();
        }
 
        A(){
            System.out.println("Default Constructor....");
            System.out.println(sc.nextInt());
            System.out.println(sc.next());
         }
         public static void main(String[] args){
         A obj = new A();
         obj.m1(sc.nextFloat());
         }
}

        