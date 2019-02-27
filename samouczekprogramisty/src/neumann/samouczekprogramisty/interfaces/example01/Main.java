package neumann.samouczekprogramisty.interfaces.example01;

public class Main {

    public static void main(String[] args) {

        Oven oven = new Oven();
        BakingOven bakingOven = oven;
        RoasticOven roastingOven = oven;

        bakingOven.bakeBread();
        bakingOven.bakeCookies();
        roastingOven.roastChicken();

    }
}
