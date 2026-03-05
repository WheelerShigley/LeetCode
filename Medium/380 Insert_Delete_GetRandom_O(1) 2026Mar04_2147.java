import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    private static final Random randomizer = new Random();

    /* An ArrayList's performance here is O(n),
     * ArrayList::add(Object)      -> O(1)
     * ArrayList::remove(Object)   -> O(n)
     * ArrayList::size()           -> O(1)
     * ArrayList::get(int)         -> O(1) (index provided with Random)
     */
    private final ArrayList<Integer> set;
    /* unless we already know the indexes we want to manipulate.
     * ArrayList::add(int)       -> O(1)
     * ArrayList::remove(int)    -> O(1) (indexed via a HashMap)
     * HashMap::containsKey(Object) -> O(1)
     * HashMap lacks get(int), for a given index (as in, it's not a realistic part of the data-structure)
     */
    private final HashMap<Integer, Integer> indecies;

    public RandomizedSet() {
        set = new ArrayList<>();
        indecies = new HashMap<>();
    }

    public boolean insert(int val) {
        if( indecies.containsKey(val) ) {
            return false;
        }

        set.add(val);
        indecies.put( val, set.size()-1 );
        return true;
    }

    public boolean remove(int val) {
        if( !indecies.containsKey(val) ) {
            return false;
        }

        //"swap" last element with removed element by
        //placing copy of last element at removed-position and removing the last element
        int index = indecies.get(val);
        if(index < set.size()-1) {
            int lastElement = set.getLast();
            set.set(index, lastElement);
            indecies.put(lastElement, index);
        }
        set.removeLast();
        indecies.remove(val);
        return true;
    }

    public int getRandom() {
        return set.get(
            randomizer.nextInt( set.size() )
        );
    }
}
