import Being.LivingBeings;
import Being.BeingsOfTheEarth.Human;
import Being.BeingsOfTheEarth.Animal;
import Being.SkyBeings.Bird;


public class LivingBeingCreator implements Creator {
    @Override
    public LivingBeings createLivingBeing(String type) {
        //return new Being.BeingsOfTheEarth.Human();
        switch(type) {
            case "human":
                return new Human();
            case "animal":
                return new Animal();
            case "bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Invalid type specified");
        }
    }

    @Override
    public String toString() {
        return "LivingBeingCreator{Y se hizo la vida}";
    }
}
