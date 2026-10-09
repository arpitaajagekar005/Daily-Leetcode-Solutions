class Solution {
    public String frequencySort(String s) {
        Map<Character ,Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((c1, c2) -> map.get(c2) - map.get(c1));

        for(char c : list){
            int count = map.get(c);
            for(int i = 0; i < count; i++){
                res.append(c);
            }
        }
        return res.toString();
    }
}