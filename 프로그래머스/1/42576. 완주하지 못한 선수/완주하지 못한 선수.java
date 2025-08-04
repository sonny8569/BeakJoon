import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String , Integer> data = makeHash(completion);
        answer = getAnswer(participant , data);
        return answer;
    }
    private Map<String , Integer> makeHash(String[] completion){
        Map<String , Integer> map = new HashMap<>();
        for(String person : completion) {
            if(map.containsKey(person)){
                int data = map.get(person);
                data++;
                map.put(person , data); 
            }else{
               map.put(person , 1);    
            }
        }
        return map; 
    }
    private String getAnswer(String[] participant , Map<String , Integer> data){
        String answer = ""; 
        for(String person : participant){
            if(!data.containsKey(person)){
                answer = person;
                break; 
            }else if(data.get(person) < 0){
                answer = person; 
                break;
            }else{
                int value = data.get(person); 
                value -- ;
                if(value < 0){
                    answer = person;
                    break; 
                }
                data.put(person , value);
            }
        }
        return answer; 
    }
}