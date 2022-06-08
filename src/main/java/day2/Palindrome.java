package day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //madam=>true
        //1234321 => true
        //ankara=>false
        //küllük
        //kullanıcıdan aldığımız kelime veya rakamların polindrom olduğunu kontrol et
        //polindrom ise true değilse false dönsün

        //eğer birinci index ile sonuncu index aynı ise devam değilse çıksın(break)

        System.out.println("enter input plaase");
        String str=scan.nextLine();
        boolean isPalindrome=true;
        int lastIndex=str.length()-1;
        int firstIndex=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(firstIndex) != str.charAt(lastIndex)){
                isPalindrome=false;
                break;
            }
            lastIndex--;
            firstIndex++;
        }
        System.out.println("your input is "+isPalindrome);


        //2. yol
        String str2="madam";
        String newReverse="";

        for (int i = str2.length()-1; i >=0; i--) {
            newReverse+=str2.toCharArray()[i];

        }
        if (newReverse.equals(str2)){
            isPalindrome=true;
        }else {
            isPalindrome=false;
        }
        System.out.println("your input is "+ isPalindrome);







    }
}
