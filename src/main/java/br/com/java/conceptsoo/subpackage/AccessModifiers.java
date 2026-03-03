package br.com.java.conceptsoo.subpackage;

/**
 * defauilt: package level
 * public: any part project
 * private: current class only
 * protected: package and all subclasses
 */
public class AccessModifiers extends AccessSub {

    public static void main(String[] args) {
        AccessModifiers test = new AccessModifiers();
        test.publicMethod();
        test.protectedMethod();
        test.defaultMethod();
        test.privateMethod();
    }

    //default
    //visible for the package
    void defaultMethod(){
        //acessando0 classe protected
        protectedSubPackage();
        AccessSub test = new AccessSub();
        //protectedSubPackage()' has protected access in 'br.com.java.conceptsoo.subpackage.AccessSub'
        //test.protectedSubPackage();
    }
    private void privateMethod(){

    }
    protected void protectedMethod(){}

    public void publicMethod(){}

}
