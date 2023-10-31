class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int sum = 0;
        if(cost.length ==1) return cost[0];

        for(int i = cost.length -1;i>0;i--)
        {
            sum+=cost[i] + cost[--i];
            if (i - 2 == 0) {
                sum += cost[0];
                return sum;
            }            
            i--;
        }
        return sum;        
        
    }
}