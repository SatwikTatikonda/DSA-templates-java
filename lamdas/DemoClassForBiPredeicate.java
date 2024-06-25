package lamdas;

import java.util.function.BiPredicate;

public class DemoClassForBiPredeicate implements BiPredicate<Integer,String> {

    @Override
    public boolean test(Integer t, String u) {

        return true;
    }
    


}
