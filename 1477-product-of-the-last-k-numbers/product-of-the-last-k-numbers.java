class ProductOfNumbers {
    List<Integer> db;
    int lastZeroIdx = -1;
    int idx = -1;
    public ProductOfNumbers() {
        db = new ArrayList();
    }
    
    public void add(int num) {
        idx++;
        if (db.isEmpty()) {
            db.add(num);
        } else {
            db.add(Math.max(num, num * db.get(db.size() - 1)));
        }
        if (num == 0) lastZeroIdx = idx;
    }
    
    public int getProduct(int k) {
        // for (int num: db) {
        //     System.out.print(num + ", ");
        // }
        int n = db.size();
        if (n - k <= lastZeroIdx) return 0;
        // System.out.println("value = " + db.get(db.size() - 1) + ", " + db.get(db.size() - k - 1));
        if (n - k - 1 < 0) return db.get(n - 1);
        return db.get(n - k - 1) == 0 ? db.get(n - 1): db.get(n - 1) / db.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */