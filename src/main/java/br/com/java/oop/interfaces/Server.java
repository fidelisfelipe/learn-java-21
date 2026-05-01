package br.com.java.oop.interfaces;

interface Server {
    public void start();//Modifier 'public' is redundant for interface members
    private static void log(String msg){
        System.out.println(msg);
    }
    public static void shutdown(){//Modifier 'public' is redundant for interface members
        log("Shutting down the server...");
    }
}
