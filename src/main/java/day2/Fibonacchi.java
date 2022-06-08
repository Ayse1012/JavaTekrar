package day2;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21 34....
        //num1  num2 sum num2+sum
        //  1    1       2     3
        //      num1+  num2   sum
        //
        //kullanıcıdan alacağımız numara kadar fibonacchi yazdıralım

      fibonacchi();


    }

    public static void fibonacchi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
       int num=scan.nextInt();

        int num1=0;
        int num2=1;
        int sum=0;

        for (int i = 0; i <num; i++) {
            sum=num1+num2;
            num1=num2;
            num2=sum;

            System.out.print(sum+" ");
        }

    }


}
