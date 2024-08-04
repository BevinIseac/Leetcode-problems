import java.util.PriorityQueue;

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.add(num)) {
                pq.offer(num);
                if (pq.size() > 3) {
                    pq.poll();
                }
            }
        }

        return pq.size() == 3 ? pq.peek() : Collections.max(pq);
    }
}
