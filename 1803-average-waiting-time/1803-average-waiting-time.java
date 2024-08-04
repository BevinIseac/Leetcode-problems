class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        long total_waiting_time = 0;  // Use long to handle large sums
        int finished_prev = 0;

        for (int[] customer : customers) {
            int arrive = customer[0];
            int cook_time = customer[1];
            int start_cook = Math.max(arrive, finished_prev);
            int end_time = start_cook + cook_time;
            total_waiting_time += end_time - arrive;
            finished_prev = end_time;
        }

        return (double) total_waiting_time / n;
    }
}
