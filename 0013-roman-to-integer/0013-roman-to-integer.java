class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        int num = 0;
        int l = s.length();
        for(int i = 1; i < l; i++){
            if(map.get(s.charAt(i - 1)) < map.get(s.charAt(i))){
                num -= map.get(s.charAt(i - 1));
            }
            else{
                num += map.get(s.charAt(i - 1));
            }
        }
        num += map.get(s.charAt(l - 1));

        return num;

    }
}