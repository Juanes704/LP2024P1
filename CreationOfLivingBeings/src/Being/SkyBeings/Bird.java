package Being.SkyBeings;

public class Bird extends Being.LivingBeings implements Being.SkyBeings.SkyBeing{

    @Override
    public void born() {
        System.out.println("A nacido un pajarito");
    }

    @Override
    public void grow() {
        System.out.println("Crece crece de a poquito");
    }

    @Override
    public void respawn() {
        System.out.println("Este tiene sus hijitos");
    }

    @Override
    public void die() {
        System.out.println("y muere tranquilito");
    }

    @Override
    public void fly() {
        System.out.println("Vuela vuela por el aire");
    }

    @Override
    public void changeDimension() {
        System.out.printf("va 1829 mtrs sobre el nivel del mar hacia 2327 ");
    }

    @Override
    public void toLand() {
        System.out.println("Y ateriza");
    }

    @Override
    public String toString() {
        return "Bird{funciona}";
    }
}
