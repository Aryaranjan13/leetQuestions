class Solution {
    int max = 0, st = 0, end =0;
    public boolean isPalindrome(String s, int i, int j){
       while(i<j){
       char ch1 = s.charAt(i);
       char ch2 = s.charAt(j);
       if (ch1!=ch2)
         return false;
         i++;
         j--;
       }
       return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i =0; i<n; i++){
            for (int j=i; j<n; j++){
                if (isPalindrome(s,i,j)==true){
                    if ((j-i+1)>max){
                        max =j-i+1;
                        st = i;
                        end =j;
                    }
                }
            }
        }
     return s.substring(st, end+1);
    }
}
