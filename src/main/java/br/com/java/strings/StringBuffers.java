package br.com.java.strings;

public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("java");
        System.out.println(sb);
        sb.insert(sb.length()," add x");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        //start – The beginning index, inclusive.
        //end – The ending index, exclusive.
        System.out.println(sb.delete(8, sb.length()));
    }
}
