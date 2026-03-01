package br.com.java.conceptsoo;

sealed public class SealedClass permits SubA, SubB, SubC{ //, SubE{//as classes filhas devem ser final, sealed and non-sealed
    //pode gerar o erro: Invalid 'permits' clause: 'SubE' must directly extend 'SelledClass'
}
final class SubA extends SealedClass {}
final class SubB extends SealedClass {}
final class SubC extends SealedClass {}
//class SubD extends SelledClass {}//br.com.java.conceptsoo.SubD' is not allowed in the sealed hierarchy
class SubE{

}
