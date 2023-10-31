class Solution {
    public int longestPalindrome(String s) {
        int oddCount =0;
        Map<Character,Integer> m = new HashMap();
        for(char c:s.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
            if(m.get(c)%2!=0) oddCount++;
            else oddCount--;
        }
        if(oddCount>1) return s.length()-oddCount + 1;
        return s.length();
    }
}