package Being.BeingsOfTheEarth;

import Being.SkyBeings.SkyBeing;
import Being.LivingBeings;

public class Human extends LivingBeings implements EarthBein, SkyBeing {

    @Override
    public void born(){
        System.out.println("Naces");
    }

    @Override
    public void grow(){
        System.out.println("Creces");
    }

    @Override
    public void respawn(){
        System.out.println("Te reproduces");
    }

    @Override
    public void die(){
        System.out.println("Y mueres XP");
    }

    @Override
    public void fly() {
        System.out.println("El humano esta volando en su avion");
    }

    @Override
    public void changeDimension() {
        System.out.println("El humano cambio de dimencion salio de latam");
    }

    @Override
    public void toLand() {
        System.out.println("El humano aterriza su avion");
    }

    @Override
    public void walk() {
        System.out.println("Ando caminando con un flow violento");
    }

    @Override
    public void creep() {
        System.out.println("Traga tierra le llaman");
    }

    @Override
    public String toString() {
        return "Human{funciona}";
    }
}