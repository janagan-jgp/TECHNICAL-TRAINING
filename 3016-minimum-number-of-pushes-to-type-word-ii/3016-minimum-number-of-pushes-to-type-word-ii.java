import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        
        Arrays.sort(count);
        
        int totalPushes = 0;
        for (int i = 0; i < 26; i++) {
            int freq = count[26 - 1 - i];
            if (freq == 0) break;
            int multiplier = (i / 8) + 1;
            totalPushes += freq * multiplier;
        }
        
        return totalPushes;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna