class FreqStack {
    Map<Integer, Integer> freq = new HashMap<>();
    Map<Integer, Stack<Integer>> group = new HashMap<>();
    int maxFreq = 0;
    public FreqStack() {
    }
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        if (f > maxFreq) {
            maxFreq = f;
        }
        group.computeIfAbsent(f, z -> new Stack<>()).push(val);
    }
    public int pop() {
        int val = group.get(maxFreq).pop();
        freq.put(val, freq.get(val) - 1);
        if (group.get(maxFreq).isEmpty()) {
            maxFreq--;
        }
        return val;
    }
}
