package neumann.samouczekprogramisty.interfaces.example01;

public class Oven implements BakingOven, RoasticOven {

    private int time;
    private int temperature;

    @Override
    public void bakeCookies() {
        temperature = 200;
        time = 100;
        turnOn();
    }

    @Override
    public void bakeBread() {
        temperature = 200;
        time = 100;
        turnOn();
    }

    @Override
    public void roastChicken() {
        temperature = 200;
        time = 100;
        turnOn();
    }

    private void turnOn() {
        System.out.println(String.format("Start. Heat up to %s and work for %d minutes.", temperature, time));
    }
}
