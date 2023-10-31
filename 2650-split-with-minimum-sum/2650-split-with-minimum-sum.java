class Solution {
    public int splitNum(int num) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        char[] chars = String.valueOf(num).toCharArray();

        Arrays.sort(chars);

        for (int i = 0; i < chars.length; ++i)
            if (i % 2 == 0)
                s1.append(chars[i]);
            else
                s2.append(chars[i]);

        return Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());
  
    }
}