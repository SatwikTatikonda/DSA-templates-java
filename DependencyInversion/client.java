package DependencyInversion;

public class client {

    public static void main(String[] args) {

        Sparrow s = new Sparrow(null);
        s.fly();

        s.setFlyator(new FastFlyator());
        s.fly();

        s.setFlyator(new SlowFlyator());
        s.fly();

    }

}
