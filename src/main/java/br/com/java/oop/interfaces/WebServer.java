package br.com.java.oop.interfaces;

interface WebServer extends Server {
    public //Modifier 'public' is redundant for interface members
    default void init(){
        System.out.println("Web Server Started!");
        start();
    }
}
