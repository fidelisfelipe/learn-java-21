package br.com.java.strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer();
        sbf.append("java");
        System.out.println(sbf);
        sbf.insert(sbf.length()," add x");
        System.out.println(sbf);
        System.out.println(sbf.reverse());
        System.out.println(sbf.reverse());
        //start – The beginning index, inclusive.
        //end – The ending index, exclusive.
        System.out.println(sbf.delete(8, sbf.length()));

    }
}
