class Solution {
    static int[] symbol = new int[26];
    
    static {
        symbol['I' - 'A'] = 1;
        symbol['V' - 'A'] = 5;
        symbol['X' - 'A'] = 10;
        symbol['L' - 'A'] = 50;
        symbol['C' - 'A'] = 100;
        symbol['D' - 'A'] = 500;
        symbol['M' - 'A'] = 1000;
    }
    
    public int romanToInt(String s) {
        int res = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (symbol[s.charAt(i) - 'A'] > last) {
                res = res + symbol[s.charAt(i) - 'A'] - 2 * last;
            } else {
                res = res + symbol[s.charAt(i) - 'A'];
            }
            last = symbol[s.charAt(i) - 'A'];
        }
        return res;
    }
}
