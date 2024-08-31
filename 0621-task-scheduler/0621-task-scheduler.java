import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            frequencies[tasks[i] - 'A']++;
        }

        int maxFreq = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > maxFreq) {
                maxFreq = frequencies[i];
            }
        }
        
        int maxCount = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == maxFreq) {
                maxCount++;
            }
        }
        
        int idleSlots = (maxFreq - 1) * n + (maxCount - 1);
        return Math.max(tasks.length, idleSlots + maxFreq);
    }
}
