//create a java application where we have one class it contain one instance variable and a parameterized constructor then invoke this constructor under main method by providing dynamic input.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        A(String b){
            System.out.println(b);
        }
        public static void main(String[] args){
        A obj = new A(sc.next());
        System.out.println(obj.a);
        }
}