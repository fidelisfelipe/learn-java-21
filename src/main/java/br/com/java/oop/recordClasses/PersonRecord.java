package br.com.java.oop.recordClasses;

public record PersonRecord(String name, int age) {

    public PersonRecord() {
        this(null, 0);
    }

    //Compact canonical constructor
    public PersonRecord{
        if(age > 5){
            System.out.println("Criança");
        }else if (isBaby()){
            System.out.println("Baby");
        }else{
            System.out.println("Adulto");
        }
    }

    public boolean isBaby(){
        return this.age <= 5;
    }

    public record PersonRecordInner(boolean status){

    }
}
