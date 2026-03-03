package br.com.java.conceptsoo.subpackage;

public class AccessSubSec {

    void test(){
        AccessSub access = new AccessSub();
        //acessa protected do mesmo pacote
        access.protectedSubPackage();
    }

}
