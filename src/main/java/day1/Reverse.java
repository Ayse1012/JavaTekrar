package day1;

public class Reverse {
    public static void main(String[] args) {
        //verilen stringi tersten yazdıran metot oluşturma
        reverseStr("ABCDEFG");//GFEDCBA
        System.out.println("reverseStr= " + reverseStr("ABCDEFGH"));

        System.out.println("reverse2= " + reverse2("123456789"));
    }

    public static String reverseStr(String str){
        String newStr="";

        for (int i = str.length()-1; i >=0; i--) {

             newStr+=str.toCharArray()[i];//toCharArray() stringi array e çeviriyor
           //veya
           // newStr+=str.charAt(i);

        }
        return newStr;
    }
    //2.yol reverse() metodu
    public static String reverse2(String str){

        return new StringBuffer(str).reverse().toString();
    }
}
