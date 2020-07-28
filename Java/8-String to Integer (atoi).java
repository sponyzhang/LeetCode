class Solution {
    public int myAtoi(String str) {
        int res = 0;
        int index = 0;
        boolean inNumber = false;
        boolean negative = false;
        for ( ; index < str.length(); index++) {
            if (str.charAt(index) == ' ') {
                continue;
            } else if (str.charAt(index) == '+') {
                break;
            } else if (str.charAt(index) == '-') {
                negative = true;
                break;
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                res = str.charAt(index) - '0';
                break;
            } else {
                return 0;
            }
        }

        for (index++; index < str.length(); index++) {
            if (str.charAt(index) < '0' || str.charAt(index) > '9') {
                return negative == true ? -res : res;
            } else {
                if (res > Integer.MAX_VALUE / 10) {
                    return negative == false ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                } else if (negative == false && res == Integer.MAX_VALUE / 10 && str.charAt(index) > '7') {
                    return Integer.MAX_VALUE;
                } else if (negative == true && res == Integer.MAX_VALUE / 10 && str.charAt(index) > '8') {
                    return Integer.MIN_VALUE;
                }
                res = res * 10 + str.charAt(index) - '0';
            }
        }

        return negative == true ? -res : res;
    }
}
