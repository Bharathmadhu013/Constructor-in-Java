//create a java application where we have one class it contain a default constructor then invoke these constructor under main method.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        
        A(){
          System.out.println("Default constructor.....");
        }
        
        public static void main(String[] args){
        A obj = new A();
        }
}