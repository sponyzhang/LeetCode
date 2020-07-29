class Solution {
    static String[] symbol = new String[3001];
    
    static {
        symbol[1] = "I";
        symbol[2] = "II";
        symbol[3] = "III";
        symbol[4] = "IV";
        symbol[5] = "V";
        symbol[6] = "VI";
        symbol[7] = "VII";
        symbol[8] = "VIII";
        symbol[9] = "IX";
        symbol[10] = "X";
        symbol[20] = "XX";
        symbol[30] = "XXX";
        symbol[40] = "XL";
        symbol[50] = "L";
        symbol[60] = "LX";
        symbol[70] = "LXX";
        symbol[80] = "LXXX";
        symbol[90] = "XC";
        symbol[100] = "C";
        symbol[200] = "CC";
        symbol[300] = "CCC";
        symbol[400] = "CD";
        symbol[500] = "D";
        symbol[600] = "DC";
        symbol[700] = "DCC";
        symbol[800] = "DCCC";
        symbol[900] = "CM";
        symbol[1000] = "M";
        symbol[2000] = "MM";
        symbol[3000] = "MMM";
    }
    
    public String intToRoman(int num) {
        String res = "";
        int step = 1000;
        while (num != 0) {
            if (num / step != 0) {
                res += symbol[(num / step) * step];
                num %= step;
            }
            step /= 10;
        }
        return res;
    }
}
