class KthLargest {

    Queue<Integer> pq;
    int size;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>();
        size = k;
        for(int i : nums){
            pq.offer(i);
            if(pq.size() > size){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > size){
            pq.poll();
        }
        return pq.peek();
    }
}
