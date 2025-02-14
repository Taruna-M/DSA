class ProductOfNumbers {
    List<Integer> q = new ArrayList<>();
    int n = 0;
    public ProductOfNumbers() {
        q.add(1);
    }
    
    public void add(int num) {
        if (num==0){
            q = new ArrayList<>();
            q.add(1);
            n = 0;
        }
        else {
            int value = q.get(n);
            q.add(value*num);
            n++;
        }
    }
    
    public int getProduct(int k) {
        if (k<=n) return q.get(n)/q.get(n-k);
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
