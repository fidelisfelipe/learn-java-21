package br.com.java.oop.recordClasses;

import java.util.Objects;

public class PersonTwo{
    private final String name;
    private final int age;

    public PersonTwo(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * O equals é usado para comparar objetos
     *
     * Se voce nao substituir estes metodos, quando criar novos objetos serão considerados diferentes,
     * pois o ID atribuido na memória para cada objeto serão diferentes
     *
     * Lembra-se da stack e da heap, o id é a referencia do objeto da heap na stack
     *
     * Mas ao substituir ele irá comparar as informações do objeto e não a referẽncia
     *
     * @param o   the reference object with which to compare.
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonTwo personTwo = (PersonTwo) o;
        return age == personTwo.age && Objects.equals(name, personTwo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Se o toString não for sobrescrito, irá imprimir a referencia do objeto e não seu conteúdo
     * @return
     */
    @Override
    public String toString() {
        return "PersonTwo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
