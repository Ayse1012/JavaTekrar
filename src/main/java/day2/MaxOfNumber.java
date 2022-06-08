package day2;

import java.util.Scanner;

public class MaxOfNumber {
    public static void main(String[] args) {
        //kullanıcıdan sıfır girene kadar numara girmesini isteyelim
        //sıfır girdikten sonra girmiş olduğu numaraların en büyüğünü yazdır

        Scanner scn=new Scanner(System.in);
        System.out.println("enter number");

        int max=Integer.MIN_VALUE;
        int num=1;

        while (num!=0){
             num=scn.nextInt();
             if (num>max){
                 max=num;
             }
        }
        System.out.println(max);


    }
}
