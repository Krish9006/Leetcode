class Solution {
    class Pair implements Comparable<Pair> {
        int node;
        double prob; 
        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(Pair p) {
            if (this.prob == p.prob) return this.node - p.node;
            return Double.compare(p.prob, this.prob); 
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            double prob = succProb[i];
            adj.get(u).add(new Pair(v, prob));
            adj.get(v).add(new Pair(u, prob)); 
        }
        double[] prob = new double[n];
        Arrays.fill(prob, 0);
        prob[start] = 1; 
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 
        pq.add(new Pair(start, 1));
        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            int node = top.node;
            double currProb = top.prob;
            if (node == end) return currProb;
            for (Pair p : adj.get(node)) {
                double newProb = currProb * p.prob;
                if (newProb > prob[p.node]) {
                    prob[p.node] = newProb;
                    pq.add(new Pair(p.node, newProb));
                }
            }
        }
        return 0; 
    }
}
