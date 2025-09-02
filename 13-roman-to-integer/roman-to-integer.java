import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hmap = new HashMap<>();
        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);

        char[] c = s.toCharArray();
        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (i > 0 && ((c[i] == 'V' && c[i - 1] == 'I') || (c[i] == 'X' && c[i - 1] == 'I') || 
            (c[i] == 'L' && c[i - 1] == 'X') || (c[i] == 'C' && c[i - 1] == 'X') || 
            (c[i] == 'D' && c[i - 1] == 'C') || (c[i] == 'M' && c[i - 1] == 'C'))) {
                int diff = hmap.get(c[i]) - hmap.get(c[i - 1]);
                res += diff;
                i--; 
            } else {
                res += hmap.get(c[i]);
            }
        }
        return res;
    }
}
