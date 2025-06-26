import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int solution(int n) {
           String ternary = toTernary(n);
        String newString = "";
        for (int i = ternary.length() - 1; i >= 0; i--) {
            newString += ternary.charAt(i);
        }
        return Integer.parseInt(newString , 3);
    }
        private static String toTernary(int number) {
        if (number == 0) return "0";
        StringBuilder ternary = new StringBuilder();
        while (number > 0) {
            ternary.insert(0, number % 3);
            number /= 3;
        }
        return ternary.toString();
    }
}