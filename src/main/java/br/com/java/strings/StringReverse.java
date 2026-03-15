package br.com.java.strings;

public class StringReverse {
    public static void main(String[] args) {
        String text = "java test string";
        System.out.println(text);
        StringBuffer sb = new StringBuffer();
        sb.append(text);

        int length = text.length();

        String reversed = "";

        for(int i = length - 1; i >= 0; i--){
            reversed += text.charAt(i);
        }
        System.out.println(reversed);
        System.out.println("valid="+reversed.contentEquals(sb.reverse()));
    }
}
