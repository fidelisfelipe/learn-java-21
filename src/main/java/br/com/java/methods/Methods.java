package br.com.java.methods;

/**
 *
 * A principal vantagem de um método é a reutilizaćao de código
 * Um método possui:
 * Modificador de Acesso
 * Especificacao de compilacao opicional
 * Tipo de Retorno
 * Nome
 * Parametros
 * Corpo do método
 * palavra chave return
 * valor de retorno
 *
 */
public class Methods {


    //method static principal
    public static void main(String[] args) {

    }

    //method de instancia
    public void instancia(){

    }

    //method de instancia
    //especificacao de compilacao e o modificador podem alternar de local
    static public void staticPublicMethod(){

    }

    final static void methodFinalStatic(){

    }

    final void methodFinal(){}

    //private method static auxiliar
    private static void staticPrivateMethod(){

    }

    //nomenclatura valida para o compilador
    void $_meu_Metodo_3_válido(){

    }

    //nao pode conter numero no inicio
    //Finavoid 3_metodo(){}
    //nao pode ser palavra chave
    //void private(){}
    //mas pode ser maiuscula pois java é case=sensitive
    void Private(){}

    //protected methods
    void protectedMethod(){
        return;
    }

    String charMethod(){
        return String.valueOf('c');
    }


}
