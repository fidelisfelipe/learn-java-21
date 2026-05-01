package br.com.java.oop.interfaces;

public class AppServer implements WebServer{
    public void start() {
        System.out.println("App Server Started");
    }

    public static void main(String [] args){
        AppServer as = new AppServer();
        as.init();
        //static method may only be called on its containing interface
        //Metodos estaticos so podem ser chamados na interface que os contem, ou seja, Server.shutdown() e nao as.shutdown()
        //AppServer.shutdown();
        Server.shutdown();
    }
}
