package br.com.java.exceptions;

public class Exceptions2 {
    public static void main(String[] args) {
        try{
            new Exceptions2().method();
        }catch (Exception e){}
        }

    static void method() throws Exception{//Unhandled exception: java.lang.Exception
        throw new Exception();
    }
    }
