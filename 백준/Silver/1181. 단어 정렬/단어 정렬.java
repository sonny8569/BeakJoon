import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> wordSet = new HashSet<>();

        // 단어 입력 및 중복 제거
        for (int i = 0; i < n; i++) {
            wordSet.add(br.readLine());
        }

        // 중복 제거된 단어들을 리스트로 변환
        List<String> wordList = new ArrayList<>(wordSet);

        // 정렬: 1) 길이 오름차순 2) 길이가 같으면 사전순
        wordList.sort((s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            }
            return s1.compareTo(s2);
        });

        // 출력
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}