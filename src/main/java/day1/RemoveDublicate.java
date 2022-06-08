package day1;

public class RemoveDublicate {
    public static void main(String[] args) {
        //verilen bir strin te tekrarı olan harfleri kaldıran bir metot yaz

        System.out.println("removeDublicate(WAAABBBCCCC) = " + removeDublicate("WAAABBBCCCC"));

        System.out.println("rmSubstring(\"WWWWHHHHHKKKKKK\") = " + rmSubstring("WWWWHHHHHKKKKKK"));

    }

    public static String removeDublicate(String str){
        String result="";

        //burada charAt metoto bize istenilen indexteki karakterin standart olan sayısal değerini (ASCII kod) verir
        //bu sayısal değeri karaktere çevirmek için str.charAt() in önüne "" koymalıyız
        int abc=str.charAt(0);
        System.out.println("abc ="+ abc);

        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }
    //2.yol
    public static String rmSubstring(String str){

        String  result="";

        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        return result;
    }
}
