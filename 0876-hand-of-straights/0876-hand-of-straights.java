import java.util.Arrays;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);

        for (int i = 0; i < n; i++) {
            if (hand[i] == -1) {
                continue;
            }

            int startCard = hand[i];
            for (int j = 0; j < groupSize; j++) {
                int currentCard = startCard + j;
                boolean cardFound = false;
                for (int k = i; k < n; k++) {
                    if (hand[k] == currentCard) {
                        hand[k] = -1;
                        cardFound = true;
                        break;
                    }
                }
                if (!cardFound) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] hand1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize1 = 3;
        System.out.println(solution.isNStraightHand(hand1, groupSize1)); 

        int[] hand2 = {1, 2, 3, 4, 5};
        int groupSize2 = 4;
        System.out.println(solution.isNStraightHand(hand2, groupSize2)); 
    }
}
