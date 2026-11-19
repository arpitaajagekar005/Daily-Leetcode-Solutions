class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combine( 0, candidates, new ArrayList<>(), res, target);
        return res;
    }

    private void combine(int i, int[] cand, List<Integer> l, List<List<Integer>> res, int t){
        if(t == 0){
            res.add(new ArrayList<>(l));
            return;
        }
        if(t < 0 || i >= cand.length){
            return;
        }
        
        l.add(cand[i]);
        combine(i + 1, cand, l, res, t - cand[i]);
        l.remove(l.size() - 1);
        int next = i + 1;
        while(next < cand.length && cand[next] == cand[i]){
            next++;
        }
        combine(next, cand, l , res, t);
        return;
    }
}