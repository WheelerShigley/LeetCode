import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    private final List<Integer> set;
    private final Random random;

    public RandomizedSet() {
        set = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if( set.contains(val) ) {
            return false;
        }

        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        if( !set.contains(val) ) {
            return false;
        }

        set.remove( (Integer)val );
        return true;
    }

    public int getRandom() {
        return set.get( getRandomIndex() );
    }

    private int getRandomIndex() {
        return random.nextInt( set.size() );
    }
}
