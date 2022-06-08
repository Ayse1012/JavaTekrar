package day3;

import java.util.Random;

public class SumOfEvenOddNumbers {
    public static void main(String[] args) {
        //kullanıcıdan alacağın sayıya kadar olan tek ve çift sayıların toplamını yazdıran bir metot yaz

        Random rn=new Random();
        int number=rn.nextInt(100)+1; //sıfır ı vermesini istemiyorsak +1(1 den 100 e kadar)
        sumEvenOdd(number);
        sumEvenOdd(10);


    }
    public static void sumEvenOdd(int num){
        int çiftSum=0;
        int tekSum=0;

        for (int i = 0; i <num; i++) {
            if (i%2==0){
                çiftSum+=i;
            }else {
                tekSum+=i;
            }
        }

        System.out.println(çiftSum);
        System.out.println(tekSum);


    }


}
