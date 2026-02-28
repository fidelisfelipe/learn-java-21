package br.com.java.conceptsoo;

sealed public class SelledClass permits SubA, SubB, SubC{ //, SubE{//as classes filhas devem ser final, sealed and non-sealed
    //pode gerar o erro: Invalid 'permits' clause: 'SubE' must directly extend 'SelledClass'
}
final class SubA extends SelledClass {}
final class SubB extends SelledClass {}
final class SubC extends SelledClass {}
//class SubD extends SelledClass {}//br.com.java.conceptsoo.SubD' is not allowed in the sealed hierarchy
class SubE{

}
