package br.com.java.methods;

public class MethodsOverload {
    public static void main(String[] args) {
        var neto = new Neto();
        neto.trabalhaCom();
        neto.trabalhaCom("nova profissão");
    }
}
class Avo{
    public void trabalhaCom(){
        System.out.println("Eletricista");
    }
    public void trabalhaCom(String novo){
        System.out.println(novo);
    }
}
class Pai extends Avo{
    @Override
    public void trabalhaCom(){
        System.out.println("Segurança");
    }
    //'trabalhaCom()' is already defined in 'br.com.java.methods.Pai'
    //public void trabalhaCom(){}

}
class Filho extends Pai{
    @Override
    public void trabalhaCom() {
        super.trabalhaCom();
        System.out.println("Tecnologia");
    }
}
class Neto extends Filho{

    @Override
    public void trabalhaCom() {
        super.trabalhaCom();
        System.out.println("IA");
    }
}