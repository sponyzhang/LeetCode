class Solution {
    private static String[] table = new String[10];

    static {
        table[0] = "";
        table[1] = "";
        table[2] = "abc";
        table[3] = "def";
        table[4] = "ghi";
        table[5] = "jkl";
        table[6] = "mno";
        table[7] = "pqrs";
        table[8] = "tuv";
        table[9] = "wxyz";
    }

    private List<String> process(List<String> list, String str) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            List<String> tmp = new ArrayList<String>();
            tmp.addAll(list);
            for (int j = 0; j < tmp.size(); j++) {
                tmp.set(j, tmp.get(j) + str.charAt(i));
            }
            res.addAll(tmp);
        }
        return res;
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() == 0) {
            return res;
        }
        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            res = process(res, table[digits.charAt(i) - '0']);
        }
        return res;
    }
}
