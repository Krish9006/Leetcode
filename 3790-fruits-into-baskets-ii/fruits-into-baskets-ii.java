public class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] basketUsed = new boolean[n];
        int unplacedFruits = 0; 
        for (int i = 0; i < n; i++) {
            int fruitQuantity = fruits[i];
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (!basketUsed[j] && baskets[j] >= fruitQuantity) {
                    basketUsed[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplacedFruits++;
            }
        }
        
        return unplacedFruits;
    }
}