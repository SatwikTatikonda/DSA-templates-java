package DependencyInversion;

public class Sparrow {

    private Flyator ref;

    // constructor injection ------
    public Sparrow(Flyator r) {
        ref = r;
    }

    // method injection
    public void setFlyator(Flyator r) {
        ref = r;
    }

    void fly() {

        if (ref == null) {
            System.out.println("no algo for flight previous");
            return;
        } else {
            ref.flightAlgo();
        }

    }

}
