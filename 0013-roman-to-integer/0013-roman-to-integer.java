class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int n = s.length();
        
        for (int i = 0; i < n - 1; i++) {
            int current = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));
            
            if (current < next) {
                num -= current;
            } else {
                num += current;
            }
        }
        
        num += getValue(s.charAt(n - 1));
        return num;
    }

    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default  -> 0;
        };
    }
}