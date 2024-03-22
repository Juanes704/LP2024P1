import Being.LivingBeings;
import Being.BeingsOfTheEarth.Human;
import Being.BeingsOfTheEarth.Animal;
import Being.SkyBeings.Bird;

public class Main {
    public static void main(String[] args) {
        Creator creator = new LivingBeingCreator();

        Human human = (Human) creator.createLivingBeing("human");
        Animal animal = (Animal) creator.createLivingBeing("animal");
        Bird bird = (Bird) creator.createLivingBeing("bird");
        System.out.println("El humano");
        human.born();
        human.grow();
        human.respawn();
        human.creep();
        human.fly();
        human.changeDimension();
        human.die();
        System.out.println();

        System.out.println("El Animal x");
        animal.born();
        animal.grow();
        animal.creep();
        animal.walk();
        animal.respawn();
        animal.die();
        System.out.println();

        System.out.println("El pajaro");
        bird.born();
        bird.grow();
        bird.fly();
        bird.changeDimension();
        bird.toLand();
        bird.respawn();
        bird.die();
    }
}