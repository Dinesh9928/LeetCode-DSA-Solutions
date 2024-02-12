class Solution {
    public String intToRoman(int n) {
       int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder sb = new StringBuilder();
        int i = 12;

        while (n > 0) {
            int quotient = n / values[i];
            n %= values[i];

            while (quotient > 0) {
                sb.append(symbols[i]);
                quotient--;
            }
            i--;
        }

        return sb.toString();
    }
}