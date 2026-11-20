class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<>();
        Map<Character,String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        findCombin( 0, digits, ls, new StringBuilder(), map);
        return ls;
        
    }
    private void findCombin(int idx, String d, List<String> ls, StringBuilder findstr, Map<Character,String> map){
        if(idx == d.length()){
            ls.add(findstr.toString());
            return;
        }

        char ch = d.charAt(idx);
        String str = map.get(ch);
        for(int i = 0; i < str.length(); i++){
            findstr.append(str.charAt(i));
            findCombin( idx + 1, d, ls, findstr, map);
            findstr.deleteCharAt(findstr.length() - 1);
        }
        return;

    }
}