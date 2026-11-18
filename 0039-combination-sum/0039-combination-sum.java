class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combine( 0, candidates, res, new ArrayList<>(), target);
        return res;
        
    }

    private void combine(int i, int[] cand, List<List<Integer>> res, List<Integer> l, int t){
        if(t == 0){
            res.add(new ArrayList(l));
            return;
        }
        if(t < 0 || i >= cand.length){
            return;
        }

        l.add(cand[i]);
        t -= cand[i];
        combine(i, cand, res, l, t);
        l.remove(l.size() - 1);
        t += cand[i];
        combine(i + 1, cand, res, l, t);
        return;
    } 
}