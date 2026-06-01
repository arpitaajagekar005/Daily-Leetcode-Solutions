class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int tot_cost = 0;
        int n = cost.length;
        int count = 0;

        for(int i = n-1; i >= 0; i--){
            tot_cost += cost[i];
            count++;
            if(count%2 == 0){
                i--;
            }   
        }
        return tot_cost;
    }
}