package day3;

import java.util.Random;

public class RandomDice {
    public static void main(String[] args) {

        //zarı randum olarak at, çıkan sayıları topla
        Random rn=new Random();


        //burda zarı on defa atmasını istedik
        for (int i = 0; i <10 ; i++) {
            int num=rn.nextInt(6)+1;
            System.out.println("num= " + num);

        }

        int dice1= rn.nextInt(6)+1;//0 hariç
        int dice2= rn.nextInt(6)+1;

        System.out.println("dice1 = " + dice1);
        System.out.println("dice2 = " + dice2);

        System.out.println("(dice1+dice2) = " + (dice1 + dice2));


    }
}
