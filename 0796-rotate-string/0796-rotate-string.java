class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int r = 0;
        for(int i = 0; i <= n; i++){
            if(rotate(s , i).equals(goal)){
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