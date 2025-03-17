class Solution {
    class pair implements Comparable<pair> {
        int node;
        double prob;
        pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(pair p) {
            return Double.compare(p.prob, this.prob); 
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            double prob = succProb[i];
            adj.get(u).add(new pair(v, prob));
            adj.get(v).add(new pair(u, prob)); 
        }
        double[] prob = new double[n];
        Arrays.fill(prob, 0.0);
        prob[start_node] = 1.0; 
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(start_node, 1.0));
        while (!pq.isEmpty()) {
            pair top = pq.poll();
            int node = top.node;
            double currProb = top.prob;
            if (node == end_node) return currProb;
            for (pair p : adj.get(node)) {
                double newProb = currProb * p.prob;
                if (newProb > prob[p.node]) {
                    prob[p.node] = newProb;
                    pq.add(new pair(p.node, newProb));
                }
            }
        }
        return 0.0; 
    }
}
