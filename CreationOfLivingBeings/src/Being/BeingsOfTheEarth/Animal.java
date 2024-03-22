package Being.BeingsOfTheEarth;
import Being.LivingBeings;
public class Animal extends LivingBeings implements  Being.BeingsOfTheEarth.EarthBein{

    @Override
    public  void born(){
        System.out.println("Nacio un nuevo animal");
    }

    @Override
    public  void grow(){
        System.out.println("Crecio el animal");
    }

    @Override
    public  void respawn(){
        System.out.println("se reproduce");
    }

    @Override
    public  void die(){
        System.out.println("Y muere");
    }

    @Override
    public void walk() {
        System.out.println("camina por el bosque");
    }

    @Override
    public void creep() {
        System.out.println("Traga tierra le llaman");
    }

    @Override
    public String toString() {
        return "Animal{funciona}";
    }
}
