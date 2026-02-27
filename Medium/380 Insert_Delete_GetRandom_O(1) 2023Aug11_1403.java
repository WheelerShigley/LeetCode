class RandomizedSet {
    List<Integer> available_numbers;
    Map<Integer,Integer> indexes;
    Random prng;

    public RandomizedSet() {
        available_numbers = new ArrayList<>();
        indexes = new HashMap<>();

        prng = new Random();
    }

    public boolean insert(int val) {
        if( indexes.containsKey(val) ) { return false; }

        indexes.put(val, available_numbers.size() );
        available_numbers.add(val);
        return true;
    }

    public boolean remove(int val) {
        if( !indexes.containsKey(val) ) { return false; }

        indexes.remove(val);
        available_numbers.remove( available_numbers.indexOf(val) );
        return true;
    }

    public int getRandom() {
        return available_numbers.get(  prng.nextInt( available_numbers.size() )  );
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */