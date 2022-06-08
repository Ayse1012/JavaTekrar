package day2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //kullanıcının girdiği sayı asalmıdır
        // asalsa true değilse false dönsün

        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");

        int input=scan.nextInt();
        boolean isPrime=true;

        if (input==0||input==1){
            isPrime=false;

        }else{
            for (int i=2; i<input; i++){
                if (input%i==0){
                    isPrime=false;
                    break;
                }else {

                }
            }
        }
        System.out.println(isPrime);



    }
    public static boolean isPrime(int num){
        boolean flag=true;
        if (num==0 || num==1){
            flag=false;
        }else {
            for (int i=2; i<num; i++){
                if (num%i==0){
                    flag=false;
                    break;
                }else {

                }
            }
        }
        System.out.println(flag);

        return flag;
    }

}
