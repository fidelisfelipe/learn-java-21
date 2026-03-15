package br.com.java.strings;

public class Strings {
    public static void main(String[] args) {
        String s = "java";
        String s1 = new String("java");

        System.out.println(4+5+"6");//9+6=96
        System.out.println(4+"5"+6);//4+5+6=456
        System.out.println("4"+5+6);//45+6=456

        s.toUpperCase();
        s.toLowerCase();
        s.concat(s1);
        s.isEmpty();
        s.equals(s1);
        s.substring(0);
        s.substring(0,3);
        s.length();
        s.charAt(3);
        s.indexOf("4");
        s.equalsIgnoreCase(s1);
        s.startsWith(s1);
        s.endsWith(s1);
        s.contains(s1);
        s.trim();

    }
}
