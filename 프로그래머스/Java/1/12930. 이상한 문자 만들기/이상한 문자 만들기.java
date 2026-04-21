class Solution {
    public String solution(String s) {
        // String < StringBuilder 효율적
        StringBuilder answer = new StringBuilder();
        
        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                // 공백이면 그대로 추가
                answer.append(c);
                // 다시 시작
                index = 0;
            } else {
                
                if (index % 2 == 0) {
                    // toUpperCase 대문자
                    answer.append(Character.toUpperCase(c));
                } else {
                    // toLowerCase 소문자
                    answer.append(Character.toLowerCase(c));
                }
                index++;
            }
        }
        return answer.toString();
    }
}