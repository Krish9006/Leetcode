class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> freq = new HashMap<>();
        int j = 0, minLen = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            int card = cards[i];
            freq.put(card, freq.getOrDefault(card, 0) + 1);
            while (freq.get(card) > 1) {
                minLen = Math.min(minLen, i - j + 1);
                freq.put(cards[j], freq.get(cards[j]) - 1);
                j++;
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}
