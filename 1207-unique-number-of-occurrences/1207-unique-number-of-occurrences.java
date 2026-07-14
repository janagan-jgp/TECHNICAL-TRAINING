class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i:arr)
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        HashSet<Integer> hset=new HashSet<>(hmap.values());
        return hset.size()==hmap.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna