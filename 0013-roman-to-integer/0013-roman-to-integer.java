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
        int i = 1;
        while(i < s.length()){
            if(map.get(s.charAt(i - 1)) < map.get(s.charAt(i))){
                num -= map.get(s.charAt(i - 1));
                i++;
            }
            else{
                num += map.get(s.charAt(i - 1));
                i++;
            }
        }
        num += map.get(s.charAt(s.length() - 1));

        return num;

    }
}