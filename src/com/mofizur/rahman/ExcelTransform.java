package com.mofizur.rahman;

/**
 * Created by mofi on 4/17/16.
 */
public class ExcelTransform {
    public int titleToNumber(String s) {
        int value = 0;
        for (int i = s.length() - 1, k = 0; i >= 0; i--, k++) {
            int val = Character.toUpperCase(s.charAt(i)) - '@';
            value += Math.pow(26, k) * val;
        }
        return value;
    }

    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        int val = 0;
        while (n > 0) {
            val = n % 26;
            n = (val != 0) ? n : n - 1;
            n /= 26;
            char c = (char) ((val != 0) ? (val + '@') : (26 + '@'));
            res.append(c);
        }
        return res.reverse().toString();
    }
}
