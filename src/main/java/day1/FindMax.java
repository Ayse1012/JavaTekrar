package day1;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        //bir array in içerisinde maksimum numarayı bulup yazdıran bir metot yaz

        int [] number={995,76,98,34};
        maxValue(number);

        Arrays.sort(number);
    }

    public static int maxValue(int [] arr){
        int max=Integer.MIN_VALUE;  //bu bize java daki en küçük sayıyı verir
        for (int num : arr) {
            if (num>max){
                max=num;
            }

        }
        System.out.println(max);
        return max;

    }
}
