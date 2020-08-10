//Design HashSet

class MyHashSet {
    int[] hash;
    /** Initialize your data structure here. */
    public MyHashSet() {
        hash = new int[1000001];
    }
    
    public void add(int key) {
        hash[key] = 1;
    }
    
    public void remove(int key) {
        hash[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(hash[key] == 1) return true;
        return false;
    }
}