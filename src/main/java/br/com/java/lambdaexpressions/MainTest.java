package br.com.java.lambdaexpressions;

public class MainTest {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void show(String animal, int speed) {
                System.out.println("The " + animal + " runs at " + speed + " km/h");
            }
        };
        animal.show("Cheetah", 120);

        Animal animal1 = MainTest::display;
        animal1.show("Snake", 20);
    }

    private static void display(String animalName, int speed){
        System.out.println("The " + animalName + " runs at " + speed + " km/h");
    }
}
