class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 1;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == ' ') {
                answer.append(s.charAt(i));
                index = 0;
                continue;
            }
            if(i == 0){
                answer.append(Character.toUpperCase(s.charAt(i)));
                continue;
            }
            if(index % 2 != 0){
                answer.append(Character.toLowerCase(s.charAt(i)));
            }else{
                answer.append(Character.toUpperCase(s.charAt(i)));
            }
            index ++;
        }
        return answer.toString();
    }
}