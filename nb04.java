//create a java application where we have one class it contains three instance variable without initialization then initialize these variables while creating object by providing dynamic inputs.


import java.util.Scanner;
  
class A{
        static Scanner sc = new Scanner(System.in);
        int a;
        String b;
        char c;
         
        A(int x, String y,char z){
            a = x;
            b = y;
            c = z;
         }
         public static void main(String[] args){
         A obj = new A(sc.nextInt(), sc.next(), sc.next().charAt(0));
         System.out.println(obj.a);
         System.out.println(obj.b);
         System.out.println(obj.c);
         }
}
        