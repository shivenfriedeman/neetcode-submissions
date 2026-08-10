class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>();

        for(int stone : stones){
            pq.offer(-stone);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x != y){
                int z = - Math.abs(x - y);
                pq.offer(z);
            }
        }


        if(pq.size() == 0){
            return 0;
        }
        return Math.abs(pq.peek());
        
    }
}
