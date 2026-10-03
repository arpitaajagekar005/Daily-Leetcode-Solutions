class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        for(int i = 0; i < n; i++){
            String rotated = rotate(s , i);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }
    public static String rotate(String s, int r){
        r = r % s.length();

        return s.substring(r) + s.substring(0,r);

    }
}