package day3;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        //switch case kullanarak hesap makinası programı yaz
        //metot oluşturalım,kullanıcının vereceği 2 rakam ve bir operatorun işlemini yapalım

        calculator(11,5,"*");
        calculator(34,4,"-");



    }
    public static void calculator(int num1,int num2,String operator){
        switch (operator){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;


        }


    }

}
