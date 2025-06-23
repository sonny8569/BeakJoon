class Solution {
    public int[] solution(long n) {
String str = String.valueOf(n);
                int[] answer = new int[ str.length()];
        for (int i =  str.length() - 1, j = 0; i >= 0; i--, j++) {
            int text =  str.charAt(i) - '0';
            answer[j] = text;
        }
        return answer;
    }
}