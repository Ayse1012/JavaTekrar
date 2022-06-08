package day3;

public class SwapValue {
    public static void main(String[] args) {
      //sayıların yerlerini değiştirme

        int num1=10;
        int num2=20;

        int num3;

         num3=num1; //10
        num1=num2;  //20
        num2=num3;  //10

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("-----------------");

        num1=num1+num2; //30
        num2=num1-num2; //10
        num1=num1-num2; //20

        System.out.println(num1);
        System.out.println(num2);
    }
}
