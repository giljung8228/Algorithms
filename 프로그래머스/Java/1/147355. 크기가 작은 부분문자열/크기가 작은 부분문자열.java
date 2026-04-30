class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // p 길이 저장
        int len = p.length();

        for (int i = 0; i <= t.length() - len; i++) {

           // len 길이 만큼 저장
            String part = t.substring(i, i + len);

            // part 보다 작거나 같냐 뭐가? p가~
            if (part.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}