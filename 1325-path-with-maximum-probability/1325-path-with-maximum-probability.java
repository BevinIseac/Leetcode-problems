

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            graph.get(u).add(new Pair(v, prob));
            graph.get(v).add(new Pair(u, prob));
        }
        double[] maxProb = new double[n];
        maxProb[start] = 1.0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Pair neighbor : graph.get(node)) {
                int nextNode = neighbor.node;
                double edgeProb = neighbor.probability;
                double newProb = maxProb[node] * edgeProb;
                if (newProb > maxProb[nextNode]) {
                    maxProb[nextNode] = newProb;
                    queue.add(nextNode);
                }
            }
        }
        return maxProb[end];
    }
    class Pair {
        int node;
        double probability;
        Pair(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
    }
}