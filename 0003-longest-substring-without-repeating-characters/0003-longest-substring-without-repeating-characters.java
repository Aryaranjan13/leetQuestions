class Solution {
    public int lengthOfLongestSubstring(String s) { 
       /* int n = s.length;
        if ( n==0 ) return 0;

        Map<Character, Integer> counts = new Hashmap<>();
         for (char c: s.tocharArray());

        
    }
}*/
        int maxLen = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}