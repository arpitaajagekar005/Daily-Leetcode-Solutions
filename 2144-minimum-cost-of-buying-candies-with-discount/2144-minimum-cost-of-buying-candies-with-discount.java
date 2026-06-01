class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int tot_cost = 0;
        int n = cost.length;
        int count = 0;

        for(int i = n-1; i >= 0; i--){

            if(count < 2){
                tot_cost += cost[i];
                count++;
            }
            else{
                count = 0;
            }
            
        }
        return tot_cost;
    }
}