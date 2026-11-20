class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> sum = new ArrayList<>();
        combineSum( 0, new ArrayList<>(), sum, n, k, 1);
        return sum;
    }

    private void combineSum( int idx, ArrayList<Integer> currentSum, List<List<Integer>> sum, int n, int k, int i){
        if(idx == k){
            if(n == 0){
                sum.add(new ArrayList<>(currentSum));
                return;
            }
        }
        if(n < i){
            return;
        }
        if(i <= 9){
            currentSum.add(i);
            combineSum( idx + 1, currentSum, sum, n - i, k, i + 1);
            currentSum.remove(currentSum.size() - 1);
            int next = i + 1;
            while(next <= 9){
                currentSum.add(next);
                combineSum( idx + 1, currentSum, sum, n - next, k, next + 1);
                currentSum.remove(currentSum.size() - 1);
                next++;
            } 
        }
        return;
    }

}
